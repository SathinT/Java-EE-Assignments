package lk.ijse.jsp.dto;

public class CustomerDTO {
    private String id;
    private String name;
    private  String address;

    public CustomerDTO(){
    }

    public CustomerDTO(String id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public  String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

}
