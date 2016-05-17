/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.recurly.model;

import com.google.common.base.Objects;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "invoice")
public class Invoice extends RecurlyObject {

    @XmlElement(name = "account")
    private Account account;

//    @XmlElement(name = "original_invoice")
//    private Invoice originalInvoice;

    @XmlElement(name = "uuid")
    private String uuid;

    @XmlElement(name = "address")
    private Address address;

    @XmlElement(name = "subscription")
    private String subscriptionHref;

    @XmlElement(name = "state")
    private String state;

    @XmlElement(name = "invoice_number")
    private Integer invoiceNumber;

    @XmlElement(name = "invoice_number_prefix")
    private String invoiceNumberPrefix;

    @XmlElement(name = "original_invoice")
    private String originalInvoiceHref;

    @XmlElement(name = "po_number")
    private String poNumber;

    @XmlElement(name = "vat_number")
    private String vatNumber;

    @XmlElement(name = "subtotal_in_cents")
    private Integer subtotalInCents;

    @XmlElement(name = "tax_in_cents")
    private Integer taxInCents;

    @XmlElement(name = "total_in_cents")
    private Integer totalInCents;

    @XmlElement(name = "currency")
    private String currency;

    @XmlElement(name = "created_at")
    private DateTime createdAt;

    @XmlElement(name = "collection_method")
    private String collectionMethod;

    @XmlElement(name = "closed_at")
    private DateTime closedAt;

    @XmlElement(name = "tax_type")
    private String taxType;

    @XmlElement(name = "tax_region")
    private String taxRegion;

    @XmlElement(name = "tax_rate")
    private Double taxRate;

    @XmlElement(name = "net_terms")
    private Integer netTerms;

    @XmlElementWrapper(name = "line_items")
    @XmlElement(name = "adjustment")
    private Adjustments lineItems;

    @XmlElementWrapper(name = "transactions")
    @XmlElement(name = "transaction")
    private Transactions transactions;

    public Account getAccount() {
        if (account != null && account.getCreatedAt() == null) {
            //account = fetch(account, Account.class);
        }
        return account;
    }


    public void setAccount(final Account account) {
        this.account = account;
    }

    public Address getAddress() { return address; }

    public void setAddress(final Address address) { this.address = address; }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final Object uuid) {
        this.uuid = stringOrNull(uuid);
    }

    public String getSubscriptionHref() {
        return subscriptionHref;
    }

    public void setSubscriptionHref(final Object subscriptionHref) {
        this.subscriptionHref = hrefOrNull(subscriptionHref);
    }

    public String getState() {
        return state;
    }

    public void setState(final Object state) {
        this.state = stringOrNull(state);
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(final Object invoiceNumber) {
        this.invoiceNumber = integerOrNull(invoiceNumber);
    }

    public String getInvoiceNumberPrefix() {
        return invoiceNumberPrefix;
    }

    public void setInvoiceNumberPrefix(final Object invoiceNumberPrefix) {
        this.invoiceNumberPrefix = stringOrNull(invoiceNumberPrefix);
    }

    public String getOriginalInvoiceHref() {
        return originalInvoiceHref;
    }

    public void setOriginalInvoiceHref(final Object originalInvoiceHref) {
        this.originalInvoiceHref = hrefOrNull(originalInvoiceHref);
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(final Object poNumber) {
        this.poNumber = stringOrNull(poNumber);
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(final Object varNumber) {
        this.vatNumber = stringOrNull(varNumber);
    }

    public Integer getSubtotalInCents() {
        return subtotalInCents;
    }

    public void setSubtotalInCents(final Object subtotalInCents) {
        this.subtotalInCents = integerOrNull(subtotalInCents);
    }

    public Integer getTaxInCents() {
        return taxInCents;
    }

    public void setTaxInCents(final Object taxInCents) {
        this.taxInCents = integerOrNull(taxInCents);
    }

    public Integer getTotalInCents() {
        return totalInCents;
    }

    public void setTotalInCents(final Object totalInCents) {
        this.totalInCents = integerOrNull(totalInCents);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final Object currency) {
        this.currency = stringOrNull(currency);
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final Object createdAt) {
        this.createdAt = dateTimeOrNull(createdAt);
    }

    public DateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(final Object closedAt) {
        this.closedAt = dateTimeOrNull(closedAt);
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(final Object taxType) {
        this.taxType = stringOrNull(taxType);
    }

    public String getTaxRegion() {
        return taxRegion;
    }

    public void setTaxRegion(final Object taxRegion) {
        this.taxRegion = stringOrNull(taxRegion);
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(final Object taxRate) {
        this.taxRate = doubleOrNull(taxRate);
    }

    public String getCollectionMethod() {
        return collectionMethod;
    }

    public void setCollectionMethod(Object collectionMethod) {
        this.collectionMethod = stringOrNull(collectionMethod);
    }

    public Integer getNetTerms() {
        return netTerms;
    }

    public void setNetTerms(final Object netTerms) {
        this.netTerms = integerOrNull(netTerms);
    }

    public Adjustments getLineItems() {
        return lineItems;
    }

    public void setLineItems(final Adjustments lineItems) {
        this.lineItems = lineItems;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(final Transactions transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Invoice{");
        sb.append("account=").append(account);
        sb.append(", uuid='").append(uuid).append('\'');
        sb.append(", address='").append(address);
        sb.append(", subscriptionHref='").append(subscriptionHref).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", invoiceNumberPrefix='").append(invoiceNumberPrefix).append('\'');
        sb.append(", originalInvoiceHref='").append(originalInvoiceHref).append('\'');
        sb.append(", poNumber=").append(poNumber);
        sb.append(", vatNumber='").append(vatNumber).append('\'');
        sb.append(", subtotalInCents=").append(subtotalInCents);
        sb.append(", taxInCents=").append(taxInCents);
        sb.append(", totalInCents=").append(totalInCents);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", closedAt=").append(closedAt);
        sb.append(", taxType='").append(taxType).append('\'');
        sb.append(", taxRegion='").append(taxRegion).append('\'');
        sb.append(", taxRate=").append(taxRate);
        sb.append(", collectionMethod='").append(collectionMethod).append('\'');
        sb.append(", netTerms=").append(netTerms);
        sb.append(", lineItems=").append(lineItems);
        sb.append(", transactions=").append(transactions);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Invoice invoice = (Invoice) o;

        if (account != null ? !account.equals(invoice.account) : invoice.account != null) {
            return false;
        }
        if (subscriptionHref != null ? !subscriptionHref.equals(invoice.subscriptionHref) : invoice.subscriptionHref != null) {
            return false;
        }
        if (collectionMethod != null ? !collectionMethod.equals(invoice.collectionMethod) : invoice.collectionMethod != null) {
            return false;
        }
        if (createdAt != null ? !createdAt.equals(invoice.createdAt) : invoice.createdAt != null) {
            return false;
        }
        if (currency != null ? !currency.equals(invoice.currency) : invoice.currency != null) {
            return false;
        }
        if (invoiceNumber != null ? !invoiceNumber.equals(invoice.invoiceNumber) : invoice.invoiceNumber != null) {
            return false;
        }
        if (invoiceNumberPrefix != null ? !invoiceNumberPrefix.equals(invoice.invoiceNumberPrefix) : invoice.invoiceNumberPrefix != null) {
            return false;
        }
        if (originalInvoiceHref != null ? !originalInvoiceHref.equals(invoice.originalInvoiceHref) : invoice.originalInvoiceHref != null) {
            return false;
        }
        if (lineItems != null ? !lineItems.equals(invoice.lineItems) : invoice.lineItems != null) {
            return false;
        }
        if (netTerms != null ? !netTerms.equals(invoice.netTerms) : invoice.netTerms != null) {
            return false;
        }
        if (poNumber != null ? !poNumber.equals(invoice.poNumber) : invoice.poNumber != null) {
            return false;
        }
        if (state != null ? !state.equals(invoice.state) : invoice.state != null) {
            return false;
        }
        if (subtotalInCents != null ? !subtotalInCents.equals(invoice.subtotalInCents) : invoice.subtotalInCents != null) {
            return false;
        }
        if (taxInCents != null ? !taxInCents.equals(invoice.taxInCents) : invoice.taxInCents != null) {
            return false;
        }
        if (totalInCents != null ? !totalInCents.equals(invoice.totalInCents) : invoice.totalInCents != null) {
            return false;
        }
        if (closedAt != null ? !closedAt.equals(invoice.closedAt) : invoice.closedAt != null) {
            return false;
        }
        if (transactions != null ? !transactions.equals(invoice.transactions) : invoice.transactions != null) {
            return false;
        }
        if (uuid != null ? !uuid.equals(invoice.uuid) : invoice.uuid != null) {
            return false;
        }
        if (vatNumber != null ? !vatNumber.equals(invoice.vatNumber) : invoice.vatNumber != null) {
            return false;
        }
        if (taxType != null ? !taxType.equals(invoice.taxType) : invoice.taxType != null) {
            return false;
        }
        if (taxRegion != null ? !taxRegion.equals(invoice.taxRegion) : invoice.taxRegion != null) {
            return false;
        }
        if (taxRate != null ? !taxRate.equals(invoice.taxRate) : invoice.taxRate != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
                account,
                uuid,
                address,
                subscriptionHref,
                state,
                invoiceNumber,
                invoiceNumberPrefix,
                originalInvoiceHref,
                poNumber,
                vatNumber,
                subtotalInCents,
                totalInCents,
                taxInCents,
                currency,
                createdAt,
                closedAt,
                taxType,
                taxRegion,
                taxRate,   
                collectionMethod,
                netTerms,
                lineItems,
                transactions
        );
    }
}
