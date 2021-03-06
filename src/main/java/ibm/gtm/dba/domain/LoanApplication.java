package ibm.gtm.dba.domain;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class LoanApplication extends PanacheEntity{
    public String loanApplicationId;
    public String primaryApplicantName;
    public String secondaryApplicantName;
    public double loanAmount;
    public String propertyType;
    public String loanPurposeType;
}
