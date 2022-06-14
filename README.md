# tgBot
This repository describes the consistent development of a telegram bot for interval learning courses.
It is assumed that everyone will be able to add a course of interest to him, which should have:
- Title
- Subtopics
- Controlling questions for each subtopic
# Technology stack
- Spring boot
- Java 11
- MySQL 
- Flyway
- Slf4j
# Functional requirements
- Creating cource
- Search and selection course 
- Enable spaced repetition or not

# Project execution plan
- Creating Spring boot app :white_check_mark:<br>
- Adding CI process :white_check_mark:<br>
- Designing and building a MySQL database :white_check_mark:<br>
- Added telegram bot to project :white_check_mark:<br>
- Deployment :white_check_mark:<br> 
- Adding Flyway to app :negative_squared_cross_mark:<br> 
- Adding bot to app :negative_squared_cross_mark:<br>
- Adding logging :negative_squared_cross_mark:<br>
- ...

# Deployment
Deployment process as easy as possible:
Required software:
- terminal for running bash scripts
- docker
- docker-compose
to deploy application, switch to needed branch and run bash script:

bash start.sh bot_username bot_token 
