
import facade.ProfessionFacade;
import view.ProfessionView;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {
 
    public static void main(String[] args) {
 
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext(new String[]{"src/main/java/SpringFirstExample.xml"});
   //"src/main/java/SpringFirstDB.xml"
        ProfessionFacade pf = (ProfessionFacade)context.getBean("professionFacadeProxy");
        ProfessionView pv = new ProfessionView();
        
        pf.addProfession(pv);
        pf.updateProfession(pv);
        pf.deleteProfession(pv);
        pf.findProfession();
 
    }
}