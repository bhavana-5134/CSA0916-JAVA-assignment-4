import java.util.*;
class EventService {
 EventDao dao=new EventDao();
 void register(String id,String n,String email,int event)throws Exception{if(id.isBlank()||n.isBlank()||!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))throw new IllegalArgumentException("Enter valid ID, name and email");try{dao.register(id.trim(),n.trim(),email.trim(),event);}catch(java.sql.SQLException e){if(e.getErrorCode()==1062)throw new IllegalArgumentException("Duplicate registration for this event");throw e;}}
 List<String[]> events()throws Exception{return dao.events();}List<Object[]> rows(Integer id)throws Exception{return dao.rows(id);}
}
