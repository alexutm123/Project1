package com.example.SpringTest2.DTO;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BillRequestDTO {

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("isDefault")
    private Boolean isDefault;

    public BigDecimal getAmount() {
        return amount;
    }

    public BillRequestDTO( Boolean isDefault) {
	
		this.isDefault = isDefault;
	}
    public BillRequestDTO() {
    	

	}

	public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
