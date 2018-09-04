package com.springcloud.mybatis;

import java.io.Serializable;

/**
 * 框架表
* @ClassName: CoreCategory
* @author 胡剑
* @date 2018年2月24日
*
 */
public class CoreCategory implements Serializable{
	/** 当前表主键 */
    private Long id;
    /** 父id */
    private Long parentId;
    /** 上层框架ID */
    private Long pId;
    /** 名称 */
    private String name;
    /** 显示名称 */
    private String showName;
    /** 说明 */
    private String description;
    /** 英文名称 */
    private String enName;
    /** 英文显示名称 */
    private String enShowName;
    /** 英文说明 */
    private String enDescription;
    /** 排序 */
    private Integer priority;
    /** 数据库编码 */
    private String dbCode;
    /** id路径 */
    private String code;
    /** 中文路径 */
    private String codeName;
    /** 是否显示 */
    private Integer published;
    /** 是否删除 */
    private String status;
    /**  框架级别 */
    private Integer level;
    /** 是否为父节点 */
    private boolean isParent;
    /** 所拥有子节点数 */ 
    private int subCount;
    /**框架下指标数量**/
    private Integer indexCount;
    /** 框架下待审核数量 */
    private int auditCount;
    /***框架下待审核指标数量**/
    private Integer indexAuditCount;

    /***框架下待审核子框架数量**/
    private Long categoryAuditCount;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getEnShowName() {
        return enShowName;
    }

    public void setEnShowName(String enShowName) {
        this.enShowName = enShowName == null ? null : enShowName.trim();
    }

    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription == null ? null : enDescription.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDbCode() {
        return dbCode;
    }

    public void setDbCode(String dbCode) {
        this.dbCode = dbCode == null ? null : dbCode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}

	public int getSubCount() {
		return subCount;
	}

	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}

	public Integer getIndexCount() {
		return indexCount;
	}

	public void setIndexCount(Integer indexCount) {
		this.indexCount = indexCount;
	}

	public int getAuditCount() {
		return auditCount;
	}

	public void setAuditCount(int auditCount) {
		this.auditCount = auditCount;
	}

	public Integer getIndexAuditCount() {
		return indexAuditCount;
	}

	public void setIndexAuditCount(Integer indexAuditCount) {
		this.indexAuditCount = indexAuditCount;
	}

	public Long getCategoryAuditCount() {
		return categoryAuditCount;
	}

	public void setCategoryAuditCount(Long categoryAuditCount) {
		this.categoryAuditCount = categoryAuditCount;
	}

	
	
    
}