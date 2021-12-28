class Tv{
    String name_of_company;
    Double Screen_Size;
}

class color_tv extends Tv{
    color_tv(String company_name,Double size){
        name_of_company = company_name;
        Screen_Size = size;
    }
    public void display(){
        System.out.println("This is a color Tv");
        System.out.println("Company: "+name_of_company);
        System.out.println("Screen Size: "+ Screen_Size);
    }
}

class bnw_Tv extends Tv{
    bnw_Tv(String company_name,Double size){
        name_of_company = company_name;
        Screen_Size = size;
    }
    public void display(){
        System.out.println("This is a black and white Tv");
        System.out.println("Company: "+name_of_company);
        System.out.println("Screen Size: "+ Screen_Size);
    }
}

public class Tv_with_attribute_name_of_company{
    public static void main(String[] args) {
        color_tv t = new color_tv("LG",53.0);
        bnw_Tv b = new bnw_Tv("Samsung",32.0);
        t.display();
        b.display();
    }
}