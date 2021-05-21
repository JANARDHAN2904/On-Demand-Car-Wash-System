			    ON DEMAND CAR WASHING SYSTEM 
			   [JANARDHAN MUPPIDI]
			....................................................................................
When you think about car washing, you need to plan it at least an hour before. And the problem does not end here,
you even need to stand in a queue to get your turn. It is a cumbersome task and hence many such car washing companies came up with a solution. 
The on-demand car wash app is now becoming the user’s first choice when planning for a car wash.

Features of Car Wash Mobile App
	Here are some of the features and functionalities you need to include during the car wash app development process.
some of the identified microservices are :

 	  **MICROSERVICES **
1.ADMIN
2.USER
3.WASHER
4.ORDERS
5.PAYMENT


  Technologies Used
1} Database ---- MongoDB
2}Coding ----- Java
3}Framework----Spring (Springboot,restTemplates,Security)
4}UI -----SwaggerUI
5}Server----Eureka
6}Messaging Service ---RabbitMQ



--->			**Customer Panel**
	Authentication
The Customer Authenticates himself and then he will be provided with JWT Token , which is used to access the Resources in the app.In this way we 
also achieve Authorization.

	Adding User/Providing User Details
Customer provides his Details. customer name and Address.

	Car Wash Package
With the help of this feature customers can select any one package from the available list according to their budget Based on their car model.
cost of washing car differs based on the choosen model.

	Preferred Date
User can Set preferred date  in advance for car wash services. Helps plan for recurring services proactively.
He can Send the date along with orderdetails on placing order.

	Order
Customer makes Order based on his/her availability.

	Cancel Request
Users can cancel already placed car wash requests. They are right away canceled.

	Payment Summary
Users can get immediate payment summary for the provided service after making payment.

	Reviews & Ratings
With the help of this feature customers can share their reviews on the services they purchased and also they can give rating to that application. 
This feature will help to developers to improve their service according to their customers thought.


--->			**Car Washer Panel**
	Adding Washer
The Car wash app developer typically restricts their services to a particular location, thus, they can only provide a service location for
car wash requests from that area.
	
	Accept/Reject requests
A car washing service should have the right to accept or deny orders depending on the nature of its availability of goods and workers.

	AllOrders
Washer can see all orders and takes his orders.

	Rating
Washer can see his ratings for the completed wash.

	Service status
A car wash may go through various steps; hence, it is important that the service providers give each customer the status of their service’s proceedings.
This will help them gain consumer trust.


---->					**Admin Panel**
	Manage User/Washer  Registration
This feature reflects on the platform’s monitoring of the number of car washers and users involved. 
This provides information on frequent users and car washers, as well as contact with them or with support staff.
	
	Manage Payments
As the user pays to admin on the car washer’s behalf, this feature handles all the information involved with payment.This consists of maintaining
 a list of customers who make a payment in real-time, service providers who requested the fee andothers that have already been billed

	Manage Ratings and Reviews
This segment of the mobile app admin panel should be able to track and inspect technicians as well as consumer feedback
and opinions and function appropriately with the business’ best interests in mind.
	
	Manage WashPackages
Admin manages washpackages by adding ,removing and updating whenever needed.


			**The workflow of how an on demand car wash request is served**

1)User Authenticates himself.Then he will gets JWT token which will be used for Authorization.
2) After getting access , he will send messages to order_queue for request to place order. The one who wish to take order consumes message
     from queue and sends accepted request to user with his name.(Synchronous Messaging )
3) Now user places order with Required data.(choosing packs, washer name,car name,car model,.........). 
4) Car washers gets all orders from databases and order with his name.
5) Washer will go to user location on preferred Date.
6)Washer performs his wash based on the provided pack.
7) Washer sends messages frequently to communicate with user/customer. 
8)User sends payment through payment gateway and provides rating for service.
9) Washer receive payment in its wallet from admin.
10)Everything will be under control of ADMIN.





