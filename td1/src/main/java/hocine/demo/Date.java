package hocine.demo;



public class Date {
    String begin , end;

    public Date(){
        super();
    }

    public Date(String begin , String end){
        this.begin = begin;
        this.end = end;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
