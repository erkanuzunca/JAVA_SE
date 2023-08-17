package collections;

public class GenericcsData<T> {
    private T adi;

    public T getAdi() {
        return adi;
    }

    public void setAdi(T adi) {
        this.adi = adi;
    }

    public GenericcsData(T adi) {
        this.adi = adi;
    }

    public GenericcsData() {

    }

    public static void main(String[] args) {

        GenericcsData genericsData=new GenericcsData();
        genericsData.setAdi(false);
        System.out.println(genericsData.getAdi());


    }


}
