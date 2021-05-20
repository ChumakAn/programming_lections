package ua.lviv.iot.shoppingproject.models;

import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "mOrder")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer totalPrice;
	
	@NonNull
	private String submitter;
}
