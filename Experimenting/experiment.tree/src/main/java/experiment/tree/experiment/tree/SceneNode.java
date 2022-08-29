package experiment.tree.experiment.tree;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("scenes")
public class SceneNode {

	@Id
	private String storyId;
	
	private String parentId;
	private String option;
	private String description;
	private List<SceneNode> childNodes;
	
	//constructors
	public SceneNode() {};
	public SceneNode(String parentId, String option, String descrtion) {
		this.parentId = parentId;
		this.option = option;
		this.description = descrtion;
	}
	
	//methods
	public void insert(String parentId, String option, String description) {
		SceneNode newScene = new SceneNode(parentId, option, description);
		childNodes.add(newScene);
	}
	
	//getters & setters
	public String getStoryId() {
		return storyId;
	}
	public void setStoryId(String storyId) {
		this.storyId = storyId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<SceneNode> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(List<SceneNode> childNodes) {
		this.childNodes = childNodes;
	}
	
	
	
}
