package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "spot_trans_pending", schema = "account", catalog = "")
public class SpotTransPendingEntity {
    private long spotTransId;
    private String exchSymbolId;
    private String symbol;
    private Byte side;
    private Byte transType;
    private Byte source;
    private String exchCode;
    private Long exchAcctId;
    private Long accountBindId;
    private Long userId;
    private Long userAccountId;
    private String orderId;
    private Byte status;
    private BigDecimal price;
    private BigDecimal amount;
    private BigDecimal leftAmount;
    private BigDecimal filledAmount;
    private BigDecimal priceAvg;
    private BigDecimal filledCashAmount;
    private BigDecimal marketCashAmount;
    private Timestamp thirdCreateTime;
    private Timestamp thirdUpdateTime;
    private String remark;
    private Long baseAccountCoinId;
    private Long quoteAccountCoinId;
    private Byte synFeeStatus;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String lastUpdateFromIp;
    private Byte synPlatfomrFeeStatus;
    private BigDecimal accountDealFee;
    private BigDecimal spotDealFee;

    @Id
    @Column(name = "spot_trans_id", nullable = false)
    public long getSpotTransId() {
        return spotTransId;
    }

    public void setSpotTransId(long spotTransId) {
        this.spotTransId = spotTransId;
    }

    @Basic
    @Column(name = "exch_symbol_id", nullable = true, length = 32)
    public String getExchSymbolId() {
        return exchSymbolId;
    }

    public void setExchSymbolId(String exchSymbolId) {
        this.exchSymbolId = exchSymbolId;
    }

    @Basic
    @Column(name = "symbol", nullable = true, length = 50)
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Basic
    @Column(name = "side", nullable = true)
    public Byte getSide() {
        return side;
    }

    public void setSide(Byte side) {
        this.side = side;
    }

    @Basic
    @Column(name = "trans_type", nullable = true)
    public Byte getTransType() {
        return transType;
    }

    public void setTransType(Byte transType) {
        this.transType = transType;
    }

    @Basic
    @Column(name = "source", nullable = true)
    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    @Basic
    @Column(name = "exch_code", nullable = true, length = 50)
    public String getExchCode() {
        return exchCode;
    }

    public void setExchCode(String exchCode) {
        this.exchCode = exchCode;
    }

    @Basic
    @Column(name = "exch_acct_id", nullable = true)
    public Long getExchAcctId() {
        return exchAcctId;
    }

    public void setExchAcctId(Long exchAcctId) {
        this.exchAcctId = exchAcctId;
    }

    @Basic
    @Column(name = "account_bind_id", nullable = true)
    public Long getAccountBindId() {
        return accountBindId;
    }

    public void setAccountBindId(Long accountBindId) {
        this.accountBindId = accountBindId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_account_id", nullable = true)
    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    @Basic
    @Column(name = "order_id", nullable = true, length = 100)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 18)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 18)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "left_amount", nullable = true, precision = 18)
    public BigDecimal getLeftAmount() {
        return leftAmount;
    }

    public void setLeftAmount(BigDecimal leftAmount) {
        this.leftAmount = leftAmount;
    }

    @Basic
    @Column(name = "filled_amount", nullable = true, precision = 18)
    public BigDecimal getFilledAmount() {
        return filledAmount;
    }

    public void setFilledAmount(BigDecimal filledAmount) {
        this.filledAmount = filledAmount;
    }

    @Basic
    @Column(name = "price_avg", nullable = true, precision = 18)
    public BigDecimal getPriceAvg() {
        return priceAvg;
    }

    public void setPriceAvg(BigDecimal priceAvg) {
        this.priceAvg = priceAvg;
    }

    @Basic
    @Column(name = "filled_cash_amount", nullable = true, precision = 18)
    public BigDecimal getFilledCashAmount() {
        return filledCashAmount;
    }

    public void setFilledCashAmount(BigDecimal filledCashAmount) {
        this.filledCashAmount = filledCashAmount;
    }

    @Basic
    @Column(name = "market_cash_amount", nullable = true, precision = 18)
    public BigDecimal getMarketCashAmount() {
        return marketCashAmount;
    }

    public void setMarketCashAmount(BigDecimal marketCashAmount) {
        this.marketCashAmount = marketCashAmount;
    }

    @Basic
    @Column(name = "third_create_time", nullable = true)
    public Timestamp getThirdCreateTime() {
        return thirdCreateTime;
    }

    public void setThirdCreateTime(Timestamp thirdCreateTime) {
        this.thirdCreateTime = thirdCreateTime;
    }

    @Basic
    @Column(name = "third_update_time", nullable = true)
    public Timestamp getThirdUpdateTime() {
        return thirdUpdateTime;
    }

    public void setThirdUpdateTime(Timestamp thirdUpdateTime) {
        this.thirdUpdateTime = thirdUpdateTime;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "base_account_coin_id", nullable = true)
    public Long getBaseAccountCoinId() {
        return baseAccountCoinId;
    }

    public void setBaseAccountCoinId(Long baseAccountCoinId) {
        this.baseAccountCoinId = baseAccountCoinId;
    }

    @Basic
    @Column(name = "quote_account_coin_id", nullable = true)
    public Long getQuoteAccountCoinId() {
        return quoteAccountCoinId;
    }

    public void setQuoteAccountCoinId(Long quoteAccountCoinId) {
        this.quoteAccountCoinId = quoteAccountCoinId;
    }

    @Basic
    @Column(name = "syn_fee_status", nullable = true)
    public Byte getSynFeeStatus() {
        return synFeeStatus;
    }

    public void setSynFeeStatus(Byte synFeeStatus) {
        this.synFeeStatus = synFeeStatus;
    }

    @Basic
    @Column(name = "create_by", nullable = true, length = 64)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_by", nullable = true, length = 64)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "last_update_from_ip", nullable = true, length = 200)
    public String getLastUpdateFromIp() {
        return lastUpdateFromIp;
    }

    public void setLastUpdateFromIp(String lastUpdateFromIp) {
        this.lastUpdateFromIp = lastUpdateFromIp;
    }

    @Basic
    @Column(name = "syn_platfomr_fee_status", nullable = true)
    public Byte getSynPlatfomrFeeStatus() {
        return synPlatfomrFeeStatus;
    }

    public void setSynPlatfomrFeeStatus(Byte synPlatfomrFeeStatus) {
        this.synPlatfomrFeeStatus = synPlatfomrFeeStatus;
    }

    @Basic
    @Column(name = "account_deal_fee", nullable = true, precision = 18)
    public BigDecimal getAccountDealFee() {
        return accountDealFee;
    }

    public void setAccountDealFee(BigDecimal accountDealFee) {
        this.accountDealFee = accountDealFee;
    }

    @Basic
    @Column(name = "spot_deal_fee", nullable = true, precision = 18)
    public BigDecimal getSpotDealFee() {
        return spotDealFee;
    }

    public void setSpotDealFee(BigDecimal spotDealFee) {
        this.spotDealFee = spotDealFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpotTransPendingEntity that = (SpotTransPendingEntity) o;

        if (spotTransId != that.spotTransId) return false;
        if (exchSymbolId != null ? !exchSymbolId.equals(that.exchSymbolId) : that.exchSymbolId != null) return false;
        if (symbol != null ? !symbol.equals(that.symbol) : that.symbol != null) return false;
        if (side != null ? !side.equals(that.side) : that.side != null) return false;
        if (transType != null ? !transType.equals(that.transType) : that.transType != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (exchCode != null ? !exchCode.equals(that.exchCode) : that.exchCode != null) return false;
        if (exchAcctId != null ? !exchAcctId.equals(that.exchAcctId) : that.exchAcctId != null) return false;
        if (accountBindId != null ? !accountBindId.equals(that.accountBindId) : that.accountBindId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userAccountId != null ? !userAccountId.equals(that.userAccountId) : that.userAccountId != null)
            return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (leftAmount != null ? !leftAmount.equals(that.leftAmount) : that.leftAmount != null) return false;
        if (filledAmount != null ? !filledAmount.equals(that.filledAmount) : that.filledAmount != null) return false;
        if (priceAvg != null ? !priceAvg.equals(that.priceAvg) : that.priceAvg != null) return false;
        if (filledCashAmount != null ? !filledCashAmount.equals(that.filledCashAmount) : that.filledCashAmount != null)
            return false;
        if (marketCashAmount != null ? !marketCashAmount.equals(that.marketCashAmount) : that.marketCashAmount != null)
            return false;
        if (thirdCreateTime != null ? !thirdCreateTime.equals(that.thirdCreateTime) : that.thirdCreateTime != null)
            return false;
        if (thirdUpdateTime != null ? !thirdUpdateTime.equals(that.thirdUpdateTime) : that.thirdUpdateTime != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (baseAccountCoinId != null ? !baseAccountCoinId.equals(that.baseAccountCoinId) : that.baseAccountCoinId != null)
            return false;
        if (quoteAccountCoinId != null ? !quoteAccountCoinId.equals(that.quoteAccountCoinId) : that.quoteAccountCoinId != null)
            return false;
        if (synFeeStatus != null ? !synFeeStatus.equals(that.synFeeStatus) : that.synFeeStatus != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (lastUpdateFromIp != null ? !lastUpdateFromIp.equals(that.lastUpdateFromIp) : that.lastUpdateFromIp != null)
            return false;
        if (synPlatfomrFeeStatus != null ? !synPlatfomrFeeStatus.equals(that.synPlatfomrFeeStatus) : that.synPlatfomrFeeStatus != null)
            return false;
        if (accountDealFee != null ? !accountDealFee.equals(that.accountDealFee) : that.accountDealFee != null)
            return false;
        return spotDealFee != null ? spotDealFee.equals(that.spotDealFee) : that.spotDealFee == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (spotTransId ^ (spotTransId >>> 32));
        result = 31 * result + (exchSymbolId != null ? exchSymbolId.hashCode() : 0);
        result = 31 * result + (symbol != null ? symbol.hashCode() : 0);
        result = 31 * result + (side != null ? side.hashCode() : 0);
        result = 31 * result + (transType != null ? transType.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (exchCode != null ? exchCode.hashCode() : 0);
        result = 31 * result + (exchAcctId != null ? exchAcctId.hashCode() : 0);
        result = 31 * result + (accountBindId != null ? accountBindId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userAccountId != null ? userAccountId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (leftAmount != null ? leftAmount.hashCode() : 0);
        result = 31 * result + (filledAmount != null ? filledAmount.hashCode() : 0);
        result = 31 * result + (priceAvg != null ? priceAvg.hashCode() : 0);
        result = 31 * result + (filledCashAmount != null ? filledCashAmount.hashCode() : 0);
        result = 31 * result + (marketCashAmount != null ? marketCashAmount.hashCode() : 0);
        result = 31 * result + (thirdCreateTime != null ? thirdCreateTime.hashCode() : 0);
        result = 31 * result + (thirdUpdateTime != null ? thirdUpdateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (baseAccountCoinId != null ? baseAccountCoinId.hashCode() : 0);
        result = 31 * result + (quoteAccountCoinId != null ? quoteAccountCoinId.hashCode() : 0);
        result = 31 * result + (synFeeStatus != null ? synFeeStatus.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (lastUpdateFromIp != null ? lastUpdateFromIp.hashCode() : 0);
        result = 31 * result + (synPlatfomrFeeStatus != null ? synPlatfomrFeeStatus.hashCode() : 0);
        result = 31 * result + (accountDealFee != null ? accountDealFee.hashCode() : 0);
        result = 31 * result + (spotDealFee != null ? spotDealFee.hashCode() : 0);
        return result;
    }
}
