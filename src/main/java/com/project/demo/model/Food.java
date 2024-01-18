package com.project.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="foods")
public class Food {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="food_id")
	    private Integer fid;
		@Column(name = "food_name")
		
		private String fname;
		@Column(name = "food_price")
		private double fprice;
		@Column(name = "food_type")
		private String ftype;
		public Food() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Food(Integer fid, String fname, double fprice, String ftype) {
			super();
			this.fid = fid;
			this.fname = fname;
			this.fprice = fprice;
			this.ftype = ftype;
		}
		public Food(String fname, double fprice, String ftype) {
			super();
			this.fname = fname;
			this.fprice = fprice;
			this.ftype = ftype;
		}
		public Integer getFid() {
			return fid;
		}
		public void setFid(Integer fid) {
			this.fid = fid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public double getFprice() {
			return fprice;
		}
		public void setFprice(double fprice) {
			this.fprice = fprice;
		}
		public String getFtype() {
			return ftype;
		}
		public void setFtype(String ftype) {
			this.ftype = ftype;
		}


}
