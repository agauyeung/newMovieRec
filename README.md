#Latest working code as of 12-17-2015 on demo branch.
#Movie Recommendation System utilizing the Play Framework.

Website currently deployed at: gentle-escarpment-2863.herokuapp.com

Read Me - Movie Recommendation Engine

1.We built a movie recommendation engine using the Play Framework, the MovieLens dataset, previously using a collaborative filtering algorithm based on SVD, and now using a hybrid algorithm
2.The application can be broken down into three parts: the algorithm, the web application, and the data (stored in database and text files)
3.Design – Model/View/Controller
  a.Model – Represents the data model using code
    i.Entities that are persistent objects in the database or temporary object created for the application such as loginForm
  b.View – Scala generated html, using Twitter Bootstrap and Play Form helper classes
    i.Receives dynamic content from @variable defined in the header
  c.Controller – contains all of the application logic we have
4.Based on the MovieLens Dataset 1 Million User Ratings
5.Linked with the TheMovieDatabase.com API to pull movie poster and potential other information (credit:themoviedbjs-library)
6.Database – MySQL backend
7.Timer based SVD recalculation – every 7 days

Development Instructions:
- Install the Typesave Activator and the Play Framework.
- Using the Terminal, navigate to the newMovieRec folder.
- In the folder, run "./activator ui"
- The activator will open up in your browser, and you will be able to code, compile, and run.
- After the activator builds when opened, type "clean" into the search bar at the top to clean the build. Re-compile it.

Deployment Instructions:
- Create a Heroku account.
- Using the Terminal, navigate to the newMovieRec folder.
- In the folder, run "heroku create"
- Then push the code to the specified repository using "git push heroku <local branch>:master"
- After it has pushed, compiled, launched, and verified, type "heroku open".
- If there are any problems, check the logs by typing "heroku logs".
- You can control the deployment directly via your Heroku account on heroku.com.
