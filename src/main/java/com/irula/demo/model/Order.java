package com.irula.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderSn;

    private String buyerId;

    private String sellerCode;

    private String carId;

    private Integer orderStatus;

    private Boolean payType;

    private Long goodsAmount;

    private Date createTime;

    private Date reserveTime;

    private Date payTime;

    private Date overTime;

    private BigDecimal realPayAmount;

    private BigDecimal needPayAmount;

    private BigDecimal alreadyPayAmount;

    private String carVinNumber;

    private Boolean isStaging;

    private BigDecimal payPercent;

    private Date getCarTime;

    private Date applyRightsTime;

    private BigDecimal commission;

    private BigDecimal qualityBond;

    private BigDecimal securedTransactionsFee;

    private Date dateDelete;

    private Date dateUpdate;

    private Date settleFinishTime;

    private Date securedTransBeginTime;

    private String salesId;

    private Integer orderSource;

    private String buyerName;

    private String identityCard;

    private String buyerPhone;

    private Integer cardType;

    private String provinceCode;

    private String cityCode;

    private Integer siteId;

    private Date orderCancelTime;

    private Date carReturnTime;

    private String carName;

    private String operator;

    private String saleType;

    private String payee;

    private String bankName;

    private String bankAccount;

    private BigDecimal earnest;

    private BigDecimal premium;

    private BigDecimal downPayments;

    private BigDecimal mortgage;

    private BigDecimal mortgageHandling;

    private String transfer;

    private Long transferFee;

    private Long getArchivesFee;

    private String saleCounselorId;

    private Boolean contractStatus;

    private String buyerType;

    private String salesName;

    private BigDecimal compulsoryLiability;

    private String comments;

    private BigDecimal fairMortgageFee;

    private BigDecimal renewalDeposit;

    private BigDecimal installationFee;

    private BigDecimal insuranceProfit;

    private BigDecimal accessoriesProfit;

    private String customLabel;

    private Integer mortgagePeriod;

    private BigDecimal monthlyPaymentLoan;

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode == null ? null : sellerCode.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Long getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public BigDecimal getRealPayAmount() {
        return realPayAmount;
    }

    public void setRealPayAmount(BigDecimal realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    public BigDecimal getNeedPayAmount() {
        return needPayAmount;
    }

    public void setNeedPayAmount(BigDecimal needPayAmount) {
        this.needPayAmount = needPayAmount;
    }

    public BigDecimal getAlreadyPayAmount() {
        return alreadyPayAmount;
    }

    public void setAlreadyPayAmount(BigDecimal alreadyPayAmount) {
        this.alreadyPayAmount = alreadyPayAmount;
    }

    public String getCarVinNumber() {
        return carVinNumber;
    }

    public void setCarVinNumber(String carVinNumber) {
        this.carVinNumber = carVinNumber == null ? null : carVinNumber.trim();
    }

    public Boolean getIsStaging() {
        return isStaging;
    }

    public void setIsStaging(Boolean isStaging) {
        this.isStaging = isStaging;
    }

    public BigDecimal getPayPercent() {
        return payPercent;
    }

    public void setPayPercent(BigDecimal payPercent) {
        this.payPercent = payPercent;
    }

    public Date getGetCarTime() {
        return getCarTime;
    }

    public void setGetCarTime(Date getCarTime) {
        this.getCarTime = getCarTime;
    }

    public Date getApplyRightsTime() {
        return applyRightsTime;
    }

    public void setApplyRightsTime(Date applyRightsTime) {
        this.applyRightsTime = applyRightsTime;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getQualityBond() {
        return qualityBond;
    }

    public void setQualityBond(BigDecimal qualityBond) {
        this.qualityBond = qualityBond;
    }

    public BigDecimal getSecuredTransactionsFee() {
        return securedTransactionsFee;
    }

    public void setSecuredTransactionsFee(BigDecimal securedTransactionsFee) {
        this.securedTransactionsFee = securedTransactionsFee;
    }

    public Date getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getSettleFinishTime() {
        return settleFinishTime;
    }

    public void setSettleFinishTime(Date settleFinishTime) {
        this.settleFinishTime = settleFinishTime;
    }

    public Date getSecuredTransBeginTime() {
        return securedTransBeginTime;
    }

    public void setSecuredTransBeginTime(Date securedTransBeginTime) {
        this.securedTransBeginTime = securedTransBeginTime;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId == null ? null : salesId.trim();
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone == null ? null : buyerPhone.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Date getOrderCancelTime() {
        return orderCancelTime;
    }

    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    public Date getCarReturnTime() {
        return carReturnTime;
    }

    public void setCarReturnTime(Date carReturnTime) {
        this.carReturnTime = carReturnTime;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public BigDecimal getEarnest() {
        return earnest;
    }

    public void setEarnest(BigDecimal earnest) {
        this.earnest = earnest;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getDownPayments() {
        return downPayments;
    }

    public void setDownPayments(BigDecimal downPayments) {
        this.downPayments = downPayments;
    }

    public BigDecimal getMortgage() {
        return mortgage;
    }

    public void setMortgage(BigDecimal mortgage) {
        this.mortgage = mortgage;
    }

    public BigDecimal getMortgageHandling() {
        return mortgageHandling;
    }

    public void setMortgageHandling(BigDecimal mortgageHandling) {
        this.mortgageHandling = mortgageHandling;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer == null ? null : transfer.trim();
    }

    public Long getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(Long transferFee) {
        this.transferFee = transferFee;
    }

    public Long getGetArchivesFee() {
        return getArchivesFee;
    }

    public void setGetArchivesFee(Long getArchivesFee) {
        this.getArchivesFee = getArchivesFee;
    }

    public String getSaleCounselorId() {
        return saleCounselorId;
    }

    public void setSaleCounselorId(String saleCounselorId) {
        this.saleCounselorId = saleCounselorId == null ? null : saleCounselorId.trim();
    }

    public Boolean getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Boolean contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(String buyerType) {
        this.buyerType = buyerType == null ? null : buyerType.trim();
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName == null ? null : salesName.trim();
    }

    public BigDecimal getCompulsoryLiability() {
        return compulsoryLiability;
    }

    public void setCompulsoryLiability(BigDecimal compulsoryLiability) {
        this.compulsoryLiability = compulsoryLiability;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public BigDecimal getFairMortgageFee() {
        return fairMortgageFee;
    }

    public void setFairMortgageFee(BigDecimal fairMortgageFee) {
        this.fairMortgageFee = fairMortgageFee;
    }

    public BigDecimal getRenewalDeposit() {
        return renewalDeposit;
    }

    public void setRenewalDeposit(BigDecimal renewalDeposit) {
        this.renewalDeposit = renewalDeposit;
    }

    public BigDecimal getInstallationFee() {
        return installationFee;
    }

    public void setInstallationFee(BigDecimal installationFee) {
        this.installationFee = installationFee;
    }

    public BigDecimal getInsuranceProfit() {
        return insuranceProfit;
    }

    public void setInsuranceProfit(BigDecimal insuranceProfit) {
        this.insuranceProfit = insuranceProfit;
    }

    public BigDecimal getAccessoriesProfit() {
        return accessoriesProfit;
    }

    public void setAccessoriesProfit(BigDecimal accessoriesProfit) {
        this.accessoriesProfit = accessoriesProfit;
    }

    public String getCustomLabel() {
        return customLabel;
    }

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel == null ? null : customLabel.trim();
    }

    public Integer getMortgagePeriod() {
        return mortgagePeriod;
    }

    public void setMortgagePeriod(Integer mortgagePeriod) {
        this.mortgagePeriod = mortgagePeriod;
    }

    public BigDecimal getMonthlyPaymentLoan() {
        return monthlyPaymentLoan;
    }

    public void setMonthlyPaymentLoan(BigDecimal monthlyPaymentLoan) {
        this.monthlyPaymentLoan = monthlyPaymentLoan;
    }
}