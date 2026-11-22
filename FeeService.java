import java.math.BigDecimal;
public class FeeService {
 public String pay(String student,String text){
  if(student==null||student.isBlank()) throw new IllegalArgumentException("Enter student name");
  BigDecimal amount; try{amount=new BigDecimal(text.trim());}catch(Exception e){throw new IllegalArgumentException("Enter valid amount");}
  if(amount.signum()<=0) throw new IllegalArgumentException("Amount must be positive");
  return "Payment successful for "+student+": Rs. "+amount;
 }
}
