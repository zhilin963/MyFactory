
# My Factory
Android mobile application with SQLite Database.

<a name="desc"></a>
## 1.Description
**My Factory** is an Android mobile application, mainly used in a smart factory, to monitor devices in real time, and send alerts to end users in case of device failure.  

<div align=center><img width="600" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/iFactory.png" />  </div>    

<a name="feat"></a>
## 2.Features
This application provides the following four features:  

<div align=center><img width="500" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/feature.png" />  </div>  

* **Login**
: provides registration and login functionality for users.  
 
* **Monitoring**
: monitors the operation of each device in real time, records the real-time status. Users can view and locate the devices through the cameras in the factory.  
   
* **Maintenance**
: in case of device failure, the user receives emergency notifications and checks the recent status through the system, then cotacts the maintenance personnel.  

* **3D View**
: provides a 3D view of the factory building, including the exterior structure and the interior layout.  

## 3.Entity Relationship Model
* The system records the relevant attributes of the user, including name, role, address, password, etc.
* The user can monitor all relevant data of the devices in the factory (temperature, online/offline, voltage, etc.).
* The building structure of the factory, the location and status of all devices are visualized on the Android terminal, which also allows the user to navigate.
<div align=center><img width="500" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/er-model.png" />  </div>

## 4.Workflows
<div align=center><img width="600" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/login.png" />  </div>    
<div align=center><img width="600" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/monitor.png" />  </div> 
<div align=center><img width="600" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/repair.png" />  </div>    
<div align=center><img width="600" height="400" src="https://github.com/zhilin963/MyFactory/blob/main/IMG/3d.png" />  </div>   
