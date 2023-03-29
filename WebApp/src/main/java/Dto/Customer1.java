package Dto;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Customer1{
	
	
		@Id
		private int customer_id;
		private String customer_name;
		
		private String email;
		private long Phone_number;
		private int booking_id;
		private int location_id;
		private int drone_shot_id;
		private String created_time;

		public int getBooking_id() {
			return booking_id;
		}
		public void setBooking_id(int booking_id) {
			this.booking_id = booking_id;
		}
		public int getLocation_id() {
			return location_id;
		}
		public void setLocation_id(int location_id) {
			this.location_id = location_id;
		}
		public int getDrone_shot_id() {
			return drone_shot_id;
		}
		public void setDrone_shot_id(int drone_shot_id) {
			this.drone_shot_id = drone_shot_id;
		}
		public String getCreated_time() {
			return created_time;
		}
		public void setCreated_time(String created_time) {
			this.created_time = created_time;
		}
		public int getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}
		public String getCustomer_name() {
			return customer_name;
		}
		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhone_number() {
			return Phone_number;
		}
		public void setPhone_number(long phone_number) {
			Phone_number = phone_number;
		}

}