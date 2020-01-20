package com;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
class Product1
{
	int id;  
	String name;  
    float price; 
    public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class product1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> Productlist=new ArrayList<Product1>();
		Productlist.add(new Product1(5,"Apple",50000f));
		List<Float> ProductPriceList2=Productlist.Stream()
				.filter(p->p.Price>30000)
				.map(p->p.Price)
				.collect(Collectors.toList());
		System.out.println(ProductPriceList2);
	}

}
