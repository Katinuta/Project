package DTO;

public class Category extends Entity{

	private int categoryId;
	private String name;
	
	public Category(){}

	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	
}
