import java.util.Date;

public class VisitHistory {
    private String visitId;
    private String userId;
    private String establishmentId;
    private Date visitDate;
    private double billAmount;
    private Integer userRating;
    private String userReview;
    private Integer establishmentRating;

    private VisitHistory() {
        this.visitId = IdGenerator.generateVisitId();
        this.visitDate = new Date();
        this.billAmount = 0.0;
    }

    public VisitHistory(String userId, String establishmentId, Date visitDate) {
        this.userId = userId;
        this.establishmentId = establishmentId;
        this.visitDate = visitDate;
        this.billAmount = 300 + Math.random() * 2000;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(String establishmentId) {
        this.establishmentId = establishmentId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        if (billAmount >= 0) {
            this.billAmount = billAmount;
        }
    }

    public Integer getUserRating() {
        return userRating;
    }

    public void setUserRating() {
        if (userRating == null && ValidationUtils.isRatingValid(userRating)) {
            this.userRating = userRating;
        }
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    public Integer getEstablishmentRating() { return establishmentRating; }
    public void setEstablishmentRating(Integer establishmentRating) {
        if (establishmentRating == null || ValidationUtils.isRatingValid(establishmentRating)) {
            this.establishmentRating = establishmentRating;
        }
    }
}