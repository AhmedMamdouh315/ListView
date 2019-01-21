package mamdouh.ahmed.listview3;

public class data_class {
    private  String name,number;
    private int Image_url;

    public data_class(String name, String number, int image_url) {
        this.name = name;
        this.number = number;
        Image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getImage_url() {
        return Image_url;
    }

    public void setImage_url(int image_url) {
        Image_url = image_url;
    }
}
