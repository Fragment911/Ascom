/**
 * This file was generated by the JPA Modeler
 */
package com.hellokoding.account.Models;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author dzni0816
 */
@Entity
@Table(name = "address")
@Transactional
public class Address implements Serializable {

    @Column(name = "AddressId", table = "address", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;

    @Column(name = "AddressLine", table = "address")
    @Basic
    private String addressLine;

    @Column(name = "City", table = "address")
    @Basic
    private String city;

    @Column(name = "Country", table = "address")
    @Basic
    private String country;

    @Column(name = "PostalCode", table = "address")
    @Basic
    private String postalCode;

    @Column(name = "ModifiedDate", table = "address")
    @Basic
    private String modifiedDate;

    @OneToMany(targetEntity = Customer.class, mappedBy = "address1")
    private List<Customer> customers1;

    public Long getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine() {
        return this.addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<Customer> getCustomers1() {
        return this.customers1;
    }

    public void setCustomers1(List<Customer> customers1) {
        this.customers1 = customers1;
    }

}
