/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package path;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author NUT
 */
public class settingPath {
    
     public String path;
        public settingPath(String path){
              this.path = path;
        } 
        
        
        
       public String getPathDB() throws FileNotFoundException, IOException{
           
               //String path = application.getRealPath("/")+"setting/setting.txt";
          BufferedReader br = new BufferedReader(new FileReader(path));
           //StringBuilder sb = new StringBuilder();
            String line;
            ArrayList list = new ArrayList();
            
              while((line = br.readLine())!= null){
                //sb.append(line+",");
                list.add(line);
            }
              String sql = list.get(0).toString();
              
              
           return sql.split(",")[0];
       }
      
               }
         