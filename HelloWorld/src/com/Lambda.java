package com;
import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Product> list=new ArrayList<Product>();  
	        list.add(new Product(1,"Samsung A5",17000f));  
	        list.add(new Product(3,"Iphone 6S",65000f));
	        list.add(new Product(4,"google pixel",85000f));
		    list.add(new Product(7,"realme",55000f));
		    
		    Stream<Product> filtered_data=list.stream().filter(p->p.price<20000);
		    filtered_data.forEach(Product->System.out.println(Product.name+":"+Product.price));
	}

}
