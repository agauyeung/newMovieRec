#Latest working code as of 12-17-2015 on demo branch.
Movie Recommendation System utilizing the Play Framework.

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
