public class AreaMethods
{
  public static void main (String args[])
  {
    new AreaMethods ();
  }
  
  public AreaMethods ()
  {
    char more = 'y';
    
    while (more == 'Y' || more == 'y')
    {
      printmenu ();
      int answer = IBIO.inputInt ("Which object do you have? (1-5) ");
      double area = -1;
      if (answer == 1)
        area = circle ();
      else if (answer == 2)
        area = rectangle ();
      else if (answer == 3)
        area = triangle ();
      else if (answer == 4)
        area = square ();
      else if (answer == 5)
        area = sphere ();
      
      if (area == -1)
        System.out.println ("You must choose 1 to 5.");
      else
        System.out.println ("The area is " + area);
      
      System.out.println ("");
      more = IBIO.inputChar ("Do you want to find the area of anything else? (y/n) ");
    } 
    while (more == 'N' || more == 'n')
    {
      System.out.println ("Goodbye!");
      break;
    }
  }
 
  
  public void printmenu ()
  {
    System.out.println ("*****MENU*****");
    System.out.println (" 1. circle");
    System.out.println (" 2. rectangle");
    System.out.println (" 3. triangle");
    System.out.println (" 4. square");
    System.out.println (" 5. sphere");
  }
  
  
  public double circle ()
  { 
     double r = IBIO.inputDouble ("Enter a radius: ");
     double A = Math.PI * Math.pow (r,2);
    
     return A;
  } 
  
  
  public double rectangle ()
  { 
     double l = IBIO.inputDouble ("Enter the length: ");
     double w = IBIO.inputDouble ("Enter the width: ");
     double A = l * w;
          
     return A;
  } 
  
  
  public double triangle ()
  {  
    double b = IBIO.inputDouble ("Enter the length of the base: ");
    double h = IBIO.inputDouble ("Enter the height: ");
    double A = (h*b)/2;

    return A;
  } 
  
  
  public double square ()
  { 
    double a = IBIO.inputDouble ("Enter side length: ");
    double A = Math.pow(a,2);
   
    return A;
  } 
  
  
  public double sphere ()
  { 
    double r = IBIO.inputDouble ("Enter radius: ");
    double A = 4 * (Math.PI * Math.pow (r,2));

    return A;
  } 
} 