package rest;
import javax.persistence.*;

@Entity
@Table(name="topics")
public class Topic{
    @Id
    String id;
    int weight;
    public Topic(String id,int weight){
        this.id=id;
        this.weight=weight;
    }
    public String getId(){
        return id;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }


}