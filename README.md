

# Sorting&Lottery作業  

## Sorting  
  日期由新到舊  
  
    java -cp demo-1.0-SNAPSHOT.jar com.systex.main.Sorting new_to_old
  日期由舊到新 
  
    java -cp demo-1.0-SNAPSHOT.jar com.systex.main.Sorting old_to_new


## Lottery  
  第一個參數為產生的樂透號碼組數，第二個參數為要排除的樂透號碼  
  
    java -cp demo-1.0-SNAPSHOT.jar com.systex.main.Lottery 3 "1 2 3 4 5 6"
    //產生3組號碼，排除1, 2, 3, 4, 5, 6
