package com.springcloud.file;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.javassist.bytecode.FieldInfo;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UpLoadController {

	@RequestMapping("/upload")
	@ResponseBody
	public String uploadFile(MultipartFile file, HttpServletRequest request) {
		System.out.println("开始上传");
		try {

			// 创建文件在服务器端存放位置
			String realPath = request.getServletContext().getRealPath("/upload");
			System.out.println("realPath===" + realPath);
			File fileDir = new File(realPath);
			if (!fileDir.exists()) {
				fileDir.mkdirs();
			}
			// 生成文件在服务器端存放的名字
			String originalFilename = file.getOriginalFilename();
			String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));

			String fileName = UUID.randomUUID().toString() + fileSuffix;

			// 上传
			file.transferTo(new File(realPath + "/" + fileName));

		} catch (Exception e) {
			e.printStackTrace();
			return "上传失败";
		}

		return "success";
	}

	public String uploadFileBatch(MultipartFile[] file, HttpServletRequest request) {
		String realPath = request.getServletContext().getRealPath("/upload");
		System.out.println("开始上传");
		// 创建文件在服务器端存放位置
		File fileDir = new File(realPath);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}

		try {
			for (int i = 0; i < file.length; i++) {
				// 生成文件在服务器端存放的名字
				String originalFilename = file[i].getOriginalFilename();
				String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));

				String fileName = UUID.randomUUID().toString() + fileSuffix;

				// 上传
				file[i].transferTo(new File(realPath + "/" + fileName));
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "上传失败";
		}

		return "success";
	}

	@RequestMapping("/index")
	public String toUpload() {
		return "upload";
	}

}
