package mynotepad;
public class linearSearch {
    
    MYNOTEPAD objNote;
    
    public linearSearch(){
     objNote = new MYNOTEPAD();
    }
    
 public String[] linearSearch1(String input) 
{ 
    if (input == null || input.isEmpty()) { 
        return null; } 
    String[] words = input.split("\\s+"); 
    return words; }

 
 

//    String array[] = new String[10];
//    String search = "mehmood";
 
    int size;
    public void linearSearch2(String array[], String search)
    {
//        string = array;
//        search = a;
        size = array.length;
        int i;
        int flag = 0;
        for(i = 0; i<size; i++)
        {
            if (search.equals(array[i]))
            {
                flag = 1;
                break;
            }
        }
        if (flag ==1)
        {
            System.out.println("Word found at position " +(i));
        }
        else
        {
            System.out.println("Word not found.");
        }
    }
   
   

    public static void main(String[] args) {
        String q = "mehmood asdasd";
        linearSearch obj = new linearSearch();
//        System.out.println(obj.linearSearch1(q)[0]);
        
        // linear search main
        
//             String enter [] = new String[10];
//        int i;
//        for (i = 0; i<10; i++)
//        {
//
////            enter[i] = br.readLine();
//
//        }
//        
        String search = obj.objNote.temptxt;
        int size;
        System.out.println("Enter word to be searched.");
//        String search1 = br.readLine();
        obj.linearSearch2(obj.linearSearch1(obj.objNote.temptxt), search);
   
        

       
}
}