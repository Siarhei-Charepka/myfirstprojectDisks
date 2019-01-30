public class Disks {


    private String diskType;
    private String nameFilm;
    private Boolean store;
    private int balance;


    public Disks() {
        System.out.println("Shop created!");
    }

    public String getDiskType() {
        return diskType;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public Boolean getStore() {
        return store;
    }

    public int getBalance() {
        return balance;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public void setStore(Boolean store) {
        this.store = store;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    /*@Override
    public void displayInfo(Disks disks){
        System.out.println("");
    }*/






}
