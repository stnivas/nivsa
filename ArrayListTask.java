
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class ArrayListTask extends ArrayList<Long>{
		static Scanner input=new Scanner(System.in);
	
 //Question1
	public  ArrayList<String> createArrayList(){
	
		ArrayList<String> listOne= new ArrayList<String>();
	  
	 	return listOne;
	}
	
//Question2
	public ArrayList<String> addFiveString(String names[]){
	 
		ArrayList<String> listTwo= new ArrayList<String>();
		
			for(int run=0;run<names.length;run++){
			listTwo.add(names[run]);
			}
	     
	   return  listTwo;
	}
//Question3
	public ArrayList<Integer> addFiveIntegers(int number[]){
	
		ArrayList<Integer>listThird=new ArrayList<Integer>();
		
			for(int run=0;run<number.length ;run++){
				listThird.add(number[run]);
			}	
			
	    return listThird;
		}
	
//Question4
	 public ArrayList <ArrayListTask> addCustomobjects(){
	  
     	ArrayList<ArrayListTask > listFour=new ArrayList<>();
      	  ArrayListTask obj1=new ArrayListTask();
      	  ArrayListTask obj2=new ArrayListTask();
               listFour.add(obj1);
               listFour.add(obj2);
			   
	  		return  listFour;             
	}
	
//Question5
	public void addIntStringCustomObjects(int[] numbers, String []studentName){
	
     	ArrayList<Object> list=new ArrayList<Object>();
 	  
 	  		for(int run=0; run<numbers.length;run++){
 	     		list.add(numbers[run]);
 	        }
 	        
 	 	    for(int run=0; run<studentName.length;run++){
 	    		list.add(studentName[run]);
 	   		 }
 	   		  
 			   ArrayListTask obj1=new ArrayListTask();
 	  		   ArrayListTask obj2=new ArrayListTask();
 
 	     		 list.add(obj1);
            	 list.add(obj2);
             
             System.out.println("arraylist:"+list);
             int len=list.size();
             System.out.println("arraylist size"+len);
         }
//Question6      
       public ArrayList<String> findIndex(String[] animals,String index){
        
			ArrayList<String> listSix=new ArrayList<String>();
   	 		
   				for(int run=0; run<animals.length; run++){
   	       			 listSix.add(animals[run]);
   		   	    } 
   	 
   	     int value= listSix.indexOf(index);
   	     System.out.println("index of given values:"+value);

     	return listSix;
     }

//Question7
	public void stringIterator(String[] name){

		ArrayList<String> arrayList= new ArrayList<String>();
		
			for(int run=0;run<name.length;run++){
		//System.out.println("enter   String");
	   //String string=input.next();
				arrayList.add(name[run]);
			}
        Iterator runs=arrayList.iterator();
		while(runs.hasNext()){
		System.out.println("list elements" +runs.next());
      	}
	  //  System.out.println("arraylistSize="+list.size());
	    // System.out.println("arraylist="+list);
  
	}
	public  String printStringGivenIndex(String []adding, int indexs){
	//Question8
		ArrayList<String> list= new ArrayList<String>();
		
		for(int run=0;run<adding.length;run++){
		//System.out.println("enter  one String");
		//String string=input.next();
		list.add(adding[run]);
		}
	//	int print =list.indexOf(4);
	//System.out.println("please enter the index");
		//int index=input.nextInt();
          
             System.out.println("print the string  ="+list.get(indexs));	
	        System.out.println("arraylistSize="+list.size());
	        System.out.println("arraylist="+list);
	        return list.get(indexs);
	}
	
       public int[] findIndexOfDuplicate(String[] duplicate, String dummy){
       //Question9 doubts
         ArrayList<String> list=new ArrayList<String>();
         
          for(int run=0; run<duplicate.length; run++){
          //System.out.println("please enter the five String");							//int value;
       //   String name=input.next();
          list.add(duplicate[run]);                                                   // double name=(double)value;
          }
          
       return new int[]{list.indexOf(dummy), list.lastIndexOf(dummy)};
      
          }
          
	public ArrayList<String> addingSecondPosition(String [] added,String addPosition){
 //Question10
	
	 ArrayList<String> listTen=new ArrayList<String>();
	 for(int run=0; run<added.length;run++){
	// System.out.println("enter the string");
	// String string=input.nextLine();
	 listTen.add(added[run]);
	 }
	 //System.out.println("enter the one string");
	 //String add=input.next();
	 listTen.add(1 , addPosition);
	 
	 //System.out.println("arrayList="+list);
	 //int len=list.size();
	 //System.out.println("arrayList size="+len); 
	 
	 return listTen;
	  }
	  
	public void createSecondArrayList(String[] value){
	//Question11
   
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0;run<value.length;run++){
	//System.out.println("please enter the 10 string");
	//String string=input.next();
	list.add(value[run]);
	}
	
	List<String> listTwo=new ArrayList<String>();
	listTwo=list.subList(3,8);
	//list.add(in);s
        System.out.println(listTwo);
        }
        

        public void createThirdArrayList(String[] valueOne,String[] valueTwo){
        //Question12
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<valueOne.length;run++){
	//System.out.println("Enter the five String");
	//String string =input.next();
	list.add(valueOne[run]);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<valueTwo.length;run++){
	//System.out.println("Enter the three String");
//	String two =input.next();
	listTwo.add(valueTwo[run]);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(list );
	listThree.addAll(listTwo);
	System.out.println("array third list"+listThree);
	System.out.println("firstList+"+list);
	System.out.println("array second list"+listTwo);
       }
       
	
	public void createThirdListUseAboveList(String [] one, String[] two){
	//Question13
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<one.length;run++){
	//System.out.println("Enter the five name");
	//String name=input.next();
	list.add(one[run]);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<two.length;run++){
	//System.out.println("Enter the three name");
	//String nameTwo =input.next();
	listTwo.add(two[run]);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(listTwo);
	listThree.addAll(list );
	System.out.println("array third list"+listThree);
	int len=listThree.size();
	//System.out.println("first List+"+list);
	//System.out.println("array second list"+listTwo);
	System.out.println("arrrayList size"+len);
       }	
       
	public void removeDecimalValue(Double[] first){
	//Question14
	 ArrayList<Double> list=new ArrayList<Double>();
	 Scanner input=new Scanner(System.in);
	 for(int run=0; run<first.length; run++){ 
	 try{
	// System.out.println("print the value");
	 //double value=input.nextDouble();
	  list.add(first[run]);
	  }
	 
	  catch(InputMismatchException e){
	  System.out.println("please enter the decimal value");
	  break;
	 
	  }
	}
	  System.out.println("enter index 0 to 4");
	  int in=input.nextInt();
	   
	try { 
	  System.out.println("REMOVED VALUE "+list.remove(in));
	} 
	catch(IndexOutOfBoundsException e) {
	System.out.println("arraylist con't removed because your giveing wrong input");
 
	}
	
	System.out.println("arrayList="+list);
	  int len=list.size();
	  System.out.println("size of array list="+len);
	  }
        
	public void removeForthDecimalValue(Double[] second){
	//Question15
	ArrayList<Double> list =new ArrayList<Double>();
	for(int run=0; run<second.length; run++){
	   //System.out.println("enter the value");
	  //ssdouble value=input.nextDouble();
	list.add(second[run]);
	}
	
     System.out.println("removed element"+ list.remove(3));
      System.out.println("arrayList="+list);
      int len=list.size();
      System.out.println("size of arrayList="+len);
      }
      public void removeLongValue(Long[] third){
      //Question16
       ArrayListTask list=new ArrayListTask();
       for(int run=0; run<third.length;run++){
      // System.out.println("enter the long value");
     //  Long in=input.nextLong();
       list.add(third[run]);
      }
      list.removeRange(4,8);
     
      int len=list.size();
      System.out.println("Arraylist size"+len);
      System.out.println("Arraylist"+list);
     }     
    public ArrayList<String> removeElementFromFirst(String[] firstValue,String[] secondValue){
		//Question17
      ArrayList<String> list= new ArrayList<String>();
      for(int run=0; run<firstValue.length; run++){
     // System.out.println("enter name to first");
      //String name=input.next();
      list.add(firstValue[run]);
    }
   
   ArrayList<String> listTwo= new ArrayList<String>();
    for(int run=0; run<secondValue.length; run++){
   
  ///System.out.println("enter name second");
  //  String name=input.next();
    listTwo.add(secondValue[run]);
    }
    list.removeAll(listTwo);
    //System.out.println("arrayList"+list);
   // int len=list.size();
    //System.out.println("size of Array list"+len);
	return list;
    }
     
    public  void  removeValueNotPresent(String[] numOne,String[] numTwo){
   //Question18
    ArrayList<String> firstList= new ArrayList<String>();
    for(int run=0; run<5; run++){
    //System.out.println("enter name to first");
   // String name=input.next();
   firstList.add(numOne[run]);
    }
   ArrayList<String> secondList= new ArrayList<String>();
    for(int run=0; run<3; run++){
   // System.out.println("enter name second");
   // String name=input.next();
    secondList.add(numTwo[run]);
    }
    firstList.retainAll(secondList);
    System.out.println("arrayList"+firstList);
    int len=firstList.size();
    System.out.println("size of first Array list"+len);
    System.out.println("arrayList"+secondList);
    int length=secondList.size();
     System.out.println("size of second  Array list"+len);
	}
    
      
 	public void removeAllLongValues(){
 	//Question19
 	ArrayList<Long> list=new ArrayList<Long>();	
      	for(int i=0; i<10;i++){
      	System.out.println("enter teh long value");
      	Long in=input.nextLong();
      	list.add(in);
      	}
      	System.out.println("before list="+list);
      	int len=list.size();
      	System.out.println("size  of arraylist="+len);
      	list.removeAll(list);
      	System.out.println("after list="+list);
      	int length=list.size();
      	System.out.println("after size="+length);
      	}
      	
      	public void checkList(String[] n, String checkName){
      	//Question20
        ArrayList<String> list=new ArrayList<String>();
          for(int i=0; i<n.length; i++){
    
          list.add(n[i]);
        }
       
       System.out.println(list.contains(n));
       int length=list.size();
       System.out.println("size of arraylist"+length);
       System.out.println("arraylist"+list);
  }
       
     
	public static void main(String[] args){
	 ArrayListTask obj=new ArrayListTask();
	// Scanner input=new Scanner(System.in);
	 System.out.println("enter your choice");
	  int choice=input.nextInt();
	  
	 switch (choice) {
	 
                case 1:
                   ArrayList<String> listOne=obj. createArrayList();
				   System.out.println("ARRAYlIST "+listOne);
				   System.out.println("ARRAYlIST size "+listOne.size());
                   System.out.println(" successfully");
                
                break;
                
                case 2:
                System.out.println("enter the number of string you want too");
                 int  count=input.nextInt();
                 String[]names=new String[count];
                 System.out.println("enter the " +count+" string");
		         for(int run=0;run<count;run++){
		         System.out.println("enter any String");
		         names[run]=input.next();

		}
		         ArrayList<String> listTwo =obj.addFiveString(names);
                   System.out.println("size of list"+listTwo. size());
				     System.out.println(" list="+listTwo);
                   System.out.println("successfully");
                break;
              
                case 3:
                    System.out.println("enter the number  of string you want too");
                    count =input.nextInt();
                    int number[]=new int[count];
                    System.out.println("enter the " + count+ "number");
                    for(int run=0;run<count;run++){
		            System.out.println("enter any  number");
		            number[run]=input.nextInt();
                 }
                   ArrayList<Integer> listThird=obj.addFiveIntegers(number);
				   System.out.println("SIZE OF LIST=" +  listThird);
                   
				   
                   System.out.println("SIZE OF LIST" +  listThird.size());
                   System.out.println("successfully");
                break;
                
                case 4:
				     System.out.println("how much object you need to add list");
					 count= input.nextInt();
					 
					 
                     obj.addCustomobjects();
                    System.out.println(" successfully");
                break;
              
              
                case 5:
                     System.out.println("how much integers you need to add list");
                     count=input.nextInt();
                     int  numbers[] =new int[count];
                     System.out.println("enter the" + count+ "numbers");
                     for(int run=0; run<count;run++){
                     System.out.println("enter the number");
                     numbers[run]=input.nextInt();
                     }
                     System.out.println("how much string  you need to add list");
                      count=input.nextInt();
                       String studentName[] =new String[count];
                      for(int run=0; run<count; run++){
                      System.out.println("enter the name");
                      studentName[run]=input.next();
                    } 
       
                     obj.addIntStringCustomObjects(numbers, studentName);
                     System.out.println(" successfully");
                break;
              
              
                case 6:
                     System.out.println("how much string you need");
                      count=input.nextInt();
                      String animals[]=new String [count];
                      System.out.println("enter the " + count+"animalsName");
                      
                        for(int run=0; run<count; run++){
                         animals[run]=input.next();
                      }
                     System.out.println("enter the any one animalsName to find the index");
                        String index=input.next();
                      
                     ArrayList<String> listSix=obj.findIndex(animals , index);
                     System.out.println(" successfully");
				   
				   System.out.println("arrayList:"+listSix);
   	                int len = listSix.size();
   	                System.out.println("arrayList size:"+len);
                 	
	
                break;
              
              
                case 7:
				     System.out.println("how much value  you need to add arrayList");
				       count=input.nextInt();
				       String name[]=new String[count];
				       System.out.println("enter the"+ count +"name");
				     	  for(int run=0; run<count;run++){
				     	   name[run]=input.next();
				     	   }
				     	   
                    obj.stringIterator(name);
				  // System.out.println("arraylist="+list);
                   System.out.println(" successfully");
                break;
              
              
                case 8:
				       System.out.println("how much string you need");
                      count=input.nextInt();
                      String adding[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      adding[run]=input.next();
                      }
				  System.out.println("please enter the index");
	             	int indexs=input.nextInt();
                    String result =obj.printStringGivenIndex(adding,indexs);
                    System.out.println("arrayList index"+result);
                   System.out.println(" successfully");
                break;
              
              
                case 9:
				
				    
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String duplicate[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      duplicate[run]=input.next();
                      }
                      
                      System.out.println("enter the  duplicate values");
                         String dummy=input.next();
                        
                         
                       
                          System.out.println("enter the correct values");
                      
                         

                         
                   int[] answer = obj.findIndexOfDuplicate(duplicate, dummy);
                   System.out.println(answer[0] + " " + answer[1]);
                   
                 
                   System.out.println(" successfully");
                break;
              
              
                case 10:
				    
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String added[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      added[run]=input.next();
				
					  }
					  System.out.println("enter the string to add aecond position");
					   String  addPosition=input.next();
					  
                   ArrayList<String> listTen=obj.addingSecondPosition(added, addPosition);
                   System.out.println("size of list" +listTen.size());
                   System.out.println("arrayList" + listTen);
                   System.out.println(" successfully");
                break;
              
              
                case 11:
				
				  
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String value[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      value[run]=input.next();
				
					  }
                   obj.createSecondArrayList(value);
                   System.out.println(" successfully");
                break;
              
              
                case 12:
				
				  
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String valueOne[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueOne[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need list two");
                      count=input.nextInt();
                      String valueTwo[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueTwo[run]=input.next();
				
					  }
                   obj.createThirdArrayList(valueOne, valueTwo);
                   System.out.println(" successfully");
                break;
              
              
                case 13:
				
				
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String one[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      one[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need list two");
                      count=input.nextInt();
                      String two[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      two[run]=input.next();
				
					  }
                   obj.createThirdListUseAboveList(one, two);
                   System.out.println(" successfully");
                break;
              
              
                case 14:
				
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                     Double first[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      first[run]=input.nextDouble();
					  }
                   obj.removeDecimalValue(first);
                  System.out.println(" successfully");
                break;
              
              
                case 15:
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                      Double second[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      second[run]=input.nextDouble() ; 
					  }
                   obj.removeForthDecimalValue(second);
                   System.out.println(" successfully");
                break;
              
              
                case 16:
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                      Long third[]=new  Long [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      third[run]=input.nextLong() ; 
					  }
                   obj.removeLongValue(third);
                   System.out.println(" successfully");
                break;
              
              
                case 17:
								
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String firstValue[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      firstValue[run]=input.next() ; 
					  }
					  System.out.println("how much decimal value you need list two");
                      count=input.nextInt();
                      String secondValue[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      secondValue[run]=input.next() ; 
					  }
				
  			ArrayList<String> list=	 obj.removeElementFromFirst(firstValue,secondValue);
			     len=list.size();
				System.out.println("arraylist ="+list);
				System.out.println("arraylist size="+len);
				 
                   System.out.println(" successfully");
                break;
              
              
                case 18:
							
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String numOne[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numOne[run]=input.next() ; 
					  }
					  System.out.println("Enter the number of values ");
                      count=input.nextInt();
                      String numTwo[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numTwo[run]=input.next() ; 
					  }
                   obj.removeValueNotPresent(numOne, numTwo);
                   System.out.println(" successfully");
                break;
              
              
                case 19:
                   obj.removeAllLongValues();
                   System.out.println(" successfully");
           
                break;
                
                case 20:
                String[]  n = new String[5];
                System.out.println("enter 5 strings");
                for(int i=0; i<5; i++){
        	    n [i]=input.next();
        	}
        	System.out.println("enter strings to find List");
        	String checkName=input.next();
                   obj.checkList(n,checkName);
                   System.out.println(" successfully");
                break;
                
           }      
	 }
	}
	
	
	
	
	
