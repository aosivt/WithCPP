package aos.builder;



import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PersonWithAnnotations {
    private String firstName;
    private String lastName;

    private PersonWithAnnotations(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void main(String[] args){
        PersonWithAnnotations t = PersonWithAnnotations.builder().firstName("123").lastName("test").build();
    }
}
