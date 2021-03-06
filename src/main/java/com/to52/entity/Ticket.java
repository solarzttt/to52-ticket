package com.to52.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author tzhang
 * @date 2019/5/21 {16:32}
 */
public class Ticket implements Serializable {
    private Integer tid;
    private Client seller;
    private Integer tstate;
    private String destination;
    private String departure;
    private String dateDepart;
    private String dateArrival;
    private String timeDepart;
    private String timeArrival;
    private String seatNumber;
    private String compartmentNumber;
    private BigDecimal price;
    private BigDecimal reward;
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Client getSeller() {
        return seller;
    }

    public void setSeller(Client seller) {
        this.seller = seller;
    }

    public Integer getTstate() {
        return tstate;
    }

    public void setTstate(Integer tstate) {
        this.tstate = tstate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getTimeDepart() {
        return timeDepart;
    }

    public void setTimeDepart(String timeDepart) {
        this.timeDepart = timeDepart;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCompartmentNumber() {
        return compartmentNumber;
    }

    public void setCompartmentNumber(String compartmentNumber) {
        this.compartmentNumber = compartmentNumber;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getReward() {
        return reward;
    }

    public void setReward(BigDecimal reward) {
        this.reward = reward;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", seller=" + seller +
                ", tstate=" + tstate +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", dateDepart=" + dateDepart +
                ", dateArrival=" + dateArrival +
                ", timeDepart=" + timeDepart +
                ", timeArrival=" + timeArrival +
                ", seatNumber='" + seatNumber + '\'' +
                ", compartmentNumber='" + compartmentNumber + '\'' +
                ", price=" + price +
                ", reward=" + reward +
                '}';
    }
}
