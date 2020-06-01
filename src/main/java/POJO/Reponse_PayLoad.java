package POJO;

public class Reponse_PayLoad {

	
	
	private String Transaction_ID;
	private String Classification;
	private String ModelConfidenceScore;
	private String ResponseTimeStamp;
	private String Status;
	
	
	public String getTransaction_ID() {
		return Transaction_ID;
	}
	public void setTransaction_ID(String transaction_ID) {
		this.Transaction_ID = transaction_ID;
	}
	public String getClassification() {
		return Classification;
	}
	public void setClassification(String classification) {
		this.Classification = classification;
	}
	public String getModelConfidenceScore() {
		return ModelConfidenceScore;
	}
	public void setModelConfidenceScore(String modelConfidenceScore) {
		this.ModelConfidenceScore = modelConfidenceScore;
	}
	public String getResponseTimeStamp() {
		return ResponseTimeStamp;
	}
	public void setResponseTimeStamp(String responseTimeStamp) {
		this.ResponseTimeStamp = responseTimeStamp;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	private String Comments;
	
	
	
}
