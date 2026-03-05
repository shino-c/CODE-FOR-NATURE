#🌿 Code For Nature

A nature awareness and engagement application designed to educate users about environmental issues while encouraging daily participation through interactive activities and a reward system. The application combines learning, gamification, and environmental contribution to promote sustainable awareness.

📱 Features
🔐 User Authentication

Secure Login and Registration system

Email validation and password strength checking

One-Time Password (OTP) verification via email

Password protection using SHA-256 hashing

📅 Daily Check-In

Users can check in once per day

Earn reward points for consistent engagement

Points are automatically updated in the database

🧠 Daily Trivia

Nature-related multiple choice trivia questions

Users have two attempts to answer correctly

Earn points based on accuracy

Ability to review previous trivia questions

📰 Nature News

Displays the latest nature-related news

Filters news containing nature-related keywords

Shows the top 5 most recent articles

🛍️ Points Shop

Users can spend earned points to:

Redeem nature-themed merchandise

Support tree planting initiatives

Purchase records are stored for tracking

💝 Donation System

Users can donate to environmental NGOs

Donation distribution:

90% → NGO

10% → Platform maintenance

Users earn points based on donation amount

👤 User Profile

Users can view and manage:

Username

Email

Registration date

Delivery address

Password updates

⚙️ Technologies Used
Technology	Purpose
☕ Java	Core application development
🎨 JavaFX	Graphical User Interface
🗄️ Microsoft Access	Relational Database
🔐 SHA-256	Password Hashing
📧 Azure Email API	Email notifications & OTP
📚 Java Libraries	File handling, security, networking
🗄️ Database Structure

The system uses a relational database with multiple connected tables:

👤 User Table – Stores main user information

📍 Address Table – Stores user delivery address

❓ Trivia Table – Stores trivia attempts and results

💰 Donation Table – Records user donations

🛒 Point Shop Table – Stores reward redemption history

⚙️ User Settings Table – Stores account preferences

🔒 Security Features

To protect user data, the system implements:

🔐 Password Hashing (SHA-256)

🔁 PBKDF2 Key Derivation

📧 OTP Authentication

🛡️ Secure email verification process

These mechanisms ensure that user passwords and personal information remain protected.

🎯 Project Goal

The goal of this application is to:

🌍 Raise awareness about environmental issues

📚 Encourage learning about nature

🎮 Promote daily engagement through gamification

🌱 Support environmental contributions such as donations and tree planting

👨‍💻 Team Members

Group: UNKNOWNVARIABLES

Daniel Leong Yi Heng

Chow Shino

Lee Xiang Wen

Ng Yu Heng

Wong Yoong Yee

🚀 Future Improvements

Potential improvements for the project include:

🌐 Real-time news API integration

📊 Global leaderboard system

📱 Mobile version of the application

🧭 Location-based environmental activities

🤝 Community challenges and achievements
