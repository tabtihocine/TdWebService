package hocine.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LocCarsCon {

    private List<Cars> c= new ArrayList<Cars>();


    public LocCarsCon(){
        c.add(new Cars("11AA22","essai1", 200 , false ,null));
        c.add(new Cars("11AA33","essai2", 250, false, null));
    }

    @RequestMapping(value = "/cars" , method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public  List<Cars> getListOfCars(){
        return c;
    }

    @RequestMapping(value = "/cars/{plaque}" , method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public  Cars getCars(@PathVariable("plaque") String plaque ) throws Exception{

        Cars c1=null;
        for (int i=0 ; i<c.size() ; i++){

            if( plaque.equals(c.get(i).plaque ) ){
                 c1 =c.get(i);
            }
        }
        return c1;
    }


    @RequestMapping(value = "/cars/{plaque}" , method = RequestMethod.DELETE)
    public void deletCar(@PathVariable("plaque") String plaque) throws Exception{

        for (int i=0 ; i<c.size() ; i++){
            if( plaque.equals(c.get(i).plaque ) ){
                c.remove(i);
            }
        }
    }

    @RequestMapping(value = "/cars/{plaque}" , method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void getBack(@PathVariable("plaque") String plaque ,
                     @RequestParam(value = "rent" ,required = false) Boolean rent){

        for (int i=0 ; i<c.size() ; i++) {
            if (plaque.equals(c.get(i).plaque)) {
                c.get(i).rent=rent;
            }
        }
    }

    @RequestMapping(value = "/cars{plaque}" , method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rent(@PathVariable("plaque") String plaque ,
                     @RequestParam(value = "rent" , required = true) Boolean rent ,
                     @RequestBody Date date ) {
        for (int i=0 ; i<c.size() ; i++) {
            if (plaque.equals(c.get(i).plaque)) {
                c.get(i).rent=rent;
                System.out.println("doooo");
                c.get(i).date = date;

                System.out.println("doooo");
            }
        }


    }


    @RequestMapping(value = "/cars" , method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void   potListOfCars(@RequestBody Cars car){
        System.out.println(car);
            c.add(car);
    }
}
