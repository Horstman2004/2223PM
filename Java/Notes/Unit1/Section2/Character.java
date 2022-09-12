public class Character {
   //1. any and all global varibles
    String name;
    int age;
    String school;
    boolean drive;

   //2. any and all constructors
   //professionally it has to match the file name
    public Character(){}    //no args construct

    public Character(String n){
        //this character list is a global varible
        // = var is the one passed in
        this.name=n;
    }

    //doesn't like because you alread have a Character(String)
    //public Character(String s){
        //this character list is a global varible
        // = var is the one passed in
        //this.school=s;
    //}

    //keep the order same as you defined them above
    public Character(String n, int a){
        this.name = n;
        this.age = a;
    }

    //keep the order same as you defined them above
    public Character(String n, int a, String s, boolean d){
        this.name = n;
        this.age = a;
        this.school = s;
        this.drive = d;
    }

    //def __init__(self.n):
        //self.name=n
    
   //3. any and all methods

    //def __str__(self):
        //return ""

   public String toString(){
        return this.name;
   }
   

}
    /*
        attributes = nouns and adjective
            health
            armour
            skin
            food
            inventory
            experience
     */
    /*
        methods = verbs
            walk
            sprint
            swim
            crouch
            build
            attack (mine)
    */


/*          ak basketball or NBA street or NBA Ballerz
    attributes:
        height, weight, arm length, shoulder width, skin
        stats 
    methods:
        shoot, dribble, running, pass, watch ads
        shoot 3 point
        shoot alley oop
        shoot dunk
        shoot free throw
*/

/*          Ubisoft - character
            Insomniac - Character
            Call of Duty Activision - character
            Call of Duty Bethesda - character
        
*/
