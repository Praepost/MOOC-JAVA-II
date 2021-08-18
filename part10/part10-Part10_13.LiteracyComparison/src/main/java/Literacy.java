
public class Literacy implements Comparable<Literacy>{
    
    private String adult; 
    private String population;
    private String male;
    private String country;
    private int year;
    private Double count;
    
    public Literacy(String adult, String population, String male, String country,String year, String count){
        this.adult = adult;
        this.population = population;
        this.male = male;
        this.country = country;
        this.year = Integer.valueOf(year);
        this.count = Double.valueOf(count);
    }

    public Double getCount() {
        return count;
    }


    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Literacy ob) {
        if(this.getCount() > ob.getCount()){
            return 1;
        } else if(this.getCount()==ob.getCount()){
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return country + " (" + year + ")," + male.substring(0, male.length()-4) + ", " + count;
        
    }
    
   


}
