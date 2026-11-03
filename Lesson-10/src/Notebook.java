import java.util.HashMap;
public class Notebook {
    HashMap<String, String> contacts = new HashMap<>();
    public void addContact (String name, String phone){
        contacts.put(name,phone);
    }
    public void deleteContact(String name){
        contacts.remove(name);
    }
    public String getPhone(String name){
        if(contacts.containsKey(name)){
            String name_phone = contacts.get(name);
            System.out.println(name_phone);
        }
        return "Не найдено";
    }
    public void printAll(){
        for (var entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public String searchByPhone(String phone) {
        for (var entry : contacts.entrySet()) {
            if (entry.getValue().equals(phone)) {
                return entry.getKey();
            }
        }
        return "Не найдено";
    }
    public int count (){
        int size = contacts.size();
        return size;
    }
}
