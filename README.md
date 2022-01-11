# Repristine
**Re**storing, **Re**creating and **Re**turning the beautiful nature to its pristine form.

<img width="200" src="https://user-images.githubusercontent.com/96294811/147577924-a55dfeaa-8ea1-4a7b-9d91-9ec1ac1e4f5a.png">

## Problem Statement
As we traverse through the 21st century, make our way through the technological era, trying to keep up with the modern age, we are excessively destroying nature and our planet and environmental Hazards are exponentially increasing by the day. 
All of us are constantly advised to protect and preserve the environment, the adverse effects of the increasing pollution, and the mantra of 'Recycle, Reuse and Reduce' is one we have been perpetually been upskilled about.
However, knowing just the trivial theoretical base of the happening reality is insufficient to change people's habits and ways. 
Even though we all know that environmental preservation is each person's fundamental responsibility, we remain confounded as to how we can contribute towards saving our nature at an individual level.
Although we all aspire to contribute to environmental preservation, we often lack proper information or ideas to lend a helping hand. 

## Proposed Solution
Ceasing modernization is definitely not an option, but we can use the fundamentals of growing technology to build a dais where people all around the world can share their ideas about recycling, reducing and reusing their waste, they can help others find solutions to faced environmental problems and can play their part in achieving the global goal and rewilding mother nature. 
Repristine is a Kotlin based android application built using Android Studio and aims to function as a social media platform created to ease abiding by the fundamentals of environmental protection for all by providing a stage to share ideas, articles, opinions, and much more!
The application comprises 14 models, each targetting a separate functionality. They include: 
- **#1 Home Page 🏠:** The Home Page is the main screen that will be displayed on starting the application. The main elements of the layout comprise the logo, name, and tagline of the app. The bottom side of the page consists of a rotating universal recycling symbol signifying the wait time required for the app to load.
- **#2 Login Page 📧:** The Login Page is used to input the user's name, email address, and a password that secures their profile. The layout comprises the text edit panels for entering the user's name, email, and password and buttons to either reset the entered login credentials or to submit them. The name entered shall be stored and directly displayed as the heading for the user's personal profile page. _Additions to be made: Connect the application to Google Firebase and enable logging in using either the user's Google or Facebook accounts._
- **#3 Profile Page 👤:** The Profile Page is a display of the user's name, profile pictures, and credentials based on steps taken towards environmental conservation. The layout comprises the user's name, brief description, profile picture, carbon footprint, any links they wish to share (related or unrelated), and their contributions with respect to the app, that is the number of ideas, articles, or answers to ask questions they have shared. The profile will be displayed publicly to all users of the application. _Additions to be made: Option to enable the users to share their profile page on any social platform._
- **#4 Ideas Page 💡:** The Ideas Page is one of the prime aspects of Repristine. This page offers all users the opportunity to share creations made from waste materials that they have made or seen. The layout comprises a scrollable picture and video sharing model, with options to upload data, view the data, and view all the ideas the user has saved. Hovering over any picture/video gives avails the user the option to save that image for future reference. _Additions to be made: Option to share any image to other social platforms._
- **#5 Articles Page 📰:** The Articles Page intends to work towards creating/increasing awareness regarding current environmental situations, conditions, and issues around the world. The Articles Page has short, precise, and verified news snippets that can easily be read on the go. The layout comprises the article's title, image, main content, and buttons to navigate to the previous, next, or random article. It also has an option to 'like' the article.
- **#6 Questions Page ❓ & #7 Answers Page 🅰️:** The Questions Page and the Answers pages serves as an interactive platform on the app, common to all users. Users can ask any question related to waste management, environmental factors, recycling, reusing, and reducing. The layout of the Questions Page comprises the EditText models to add questions and relevant hashtags so that people with similar interests can answer them. The EditText models are followed by a 'Post' button and buttons that allow users to explore and navigate to questions asked by other users. The layout of the Answers Page comprises the answers to the questions along with the answerer's name. The answers are followed by an option to upvote the answer. Alternatively, the user can add their own answer to any previously answered question.
- **#8 Carbon Footprint Calculator ➕:** This page has significantly been created to give users a brief idea about the approximate Greenhouse Gas (GHG) emissions they, as an individual, emit into the atmosphere. The layout comprises the eight numeric-value-based questions based on an individual's daily/annual routine and habits. The calculated Carbon Footprint value will be directly added to the user's profile page. Once all the questions are answered, clicking the 'Submit' button will display the user's approximate Carbon FootPrint.
- **#9 Daily Self Habit Tracker 🔄:** With the purpose to help users introspect themselves and their habits, the Habit Tracker has a series of questions that allows users a slight insight into how much they have saved or harmed environmental well-being for that particular day. _Additions to be made: Awarding users with stars on fulfilling certain criteria per day and offering advantages/rewards for completing 'star streaks' for a predefined number of days._
- **#10 Tips and Facts Pages ✅:** The Tips and facts Page is a scrollable page with many advisory factoids relating to environmental protection. _Additions to be made: Option to share any tip to other social platforms._
- **#11 Global Environmental Statistics 📊:** This page provides live statistics about various factors like Average Global Temperature, Global CO2 emissions, world population, etc. precise to 24 hours. This page proposes to help create the realization of the real-time situations and statistics amongst the users.
- **#12 Recycling Centers ♻️:** In order to perpetually and efficiently recycle, users need to be provided with data about recycling centers near their location of residence. The 'Recycling Centers' Page, with the help of enabled/allowed location settings, displays a list of centers that lie in the premise of the user's current location. Each listed Center's name is followed by the articles accepted by the center, the method they implement to recycle/dispose of the articles, contact details, and the precise location of the center (a google maps hyperlink). _Additions to be made: Connect the app to Google Mapview in order to directly navigate the directions towards the centers within the app._
- **#13 Documentation Page 📄:** The Documentation Page comprises the functions of the app and the app manual followed by a Code of Conduct, common to all users, required for the smooth functioning of any virtual social platform. The layout comprises the main context followed by a button that affirms that the user agrees to abide by the app and its regulations.
- **#14 Settings Page ⚙️:** The settings page uses basic scrollbar layouts to allow the user to enable or disable certain optional features of the application.
- **Navigation:** The application uses a Navigation Graph (Jetpack Library) to feasibly navigate between all the pages. Via the Nagigation page, accessing any desired page is simply a click away.
- **Database for Info Storage:** A separate database activity has been created within the application for the storage of information about recycling centers. The database may be accessed by users or shop owners to add information about recycling centers. This data shall be stored by the application and outputted on the respective page to users based on their location. The Database uses Android ViewModel for inputting and saving the entered information.

<img width="200" src="https://user-images.githubusercontent.com/96294811/147585854-dea52530-f374-4446-b30e-4d69ea65c04b.png"><img width="200" src="https://user-images.githubusercontent.com/96294811/147585141-d729a25f-605b-4baa-bd0b-2c8ca81d0339.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147594355-13781623-e18c-4ec9-bef1-e98b36125784.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147632155-8f5fae64-7b50-4162-a198-98655a429773.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147635480-e80cdb29-bae5-4074-a69f-1ca86904bbaf.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147650177-dc324adc-fd79-4955-89db-93fda181599e.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147650182-f174194a-8662-4d83-b1f3-506f1adbde55.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147651550-b349f520-ccd0-40d4-9bf0-aed03aff5e4e.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147652664-4e2fb11e-5a65-4890-88f0-9cace69b0404.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147653560-dfa25000-5f8b-4696-b202-49acc442b631.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147689485-82108453-b56a-4578-af5f-db048ff83c20.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147690324-28592631-bfa7-4220-b3c7-9bb6de8c27a1.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147690642-4eb9e0c5-b23b-4f6a-93a8-a144f947e6cf.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147690768-cb46e9ed-691e-404c-b6cc-c4e92a893c3f.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147872098-e5f5f2dc-03c2-4ba6-bfa0-7c1243da1b1f.png">
<img width="200" src="https://user-images.githubusercontent.com/96294811/147691155-90e98932-be91-42ea-8bc0-06824232e099.png">

## Functionality & Concepts used:
- Elements used for Functionality (Kotlin Files):
1) Toolbar: A Toolbar is a generalization of action bars for use within application layouts. (MainActivity.kt)
2) Fragment: A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. (Almost all .kt files)
3) FragmentManager: FragmentManager is the class responsible for performing actions on your app's fragments, such as adding, removing, or replacing them, and adding them to the back stack. (MainActivity.kt)
4) ViewPager: ViewPager in Android is a class that allows the user to flip left and right through pages of data. (MainActivity.kt)
5) TabLayout: TabLayout provides horizontal layout to display tabs on the screen. (MainActivity.kt)
6) MutableLiveData: MutableLiveData is just a class that extends the LiveData type class. MutableLiveData is commonly used since it provides the postValue(), setValue() methods publicly, something that LiveData class doesn’t provide. (Database.kt)
7) ViewModel: The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations. (Database.kt)
8) Observer: A class can implement the Observer interface when it wants to be informed of changes in observable objects. (MessageReceiverFragment.kt)
9) Navigation: Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer. (BlankFragment.kt)
10) FragmentPagerAdapter (MainActivity.kt)
11) ViewModelProvider (MessageReceiverFragment.kt, MessageSenderFragment.kt)
12) LayoutInflator (Almost all .kt files)
13) View (Almost all .kt files)
14) ViewGroup (Almost all .kt files)
15) AppCompactActivity (Almost all .kt files)
16) Nullable (MainActivity.kt)
17) Bundle (Almost all .kt files)
18) bundleOf (BlankFragment.kt)

- Elements used for designing (Extensible Markup Language Files):
1) FrameLayout: FrameLayout is designed to block out an area on the screen to display a single item. (fragmnet_blank.xml)
2) ContraintLayout: A ConstraintLayout is a ViewGroup which allows you to position and size widgets in a flexible way. (Almost all .xml flies)
3) CoordinatorLayout: CoordinatorLayout is a super-powered FrameLayout. CoordinatorLayout is intended for two primary use cases: As a top-level application decor or chrome layout and as a container for a specific interaction with one or more child views. (activity_main.xml)
4) Linear Layout: LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally. (Almost all .xml files)
5) FragmentContainerView: FragmentContainerView is a customized Layout designed specifically for Fragments. It extends FrameLayout, so it can reliably handle Fragment Transactions, and it also has additional features to coordinate with fragment behavior. (activity_navigation_graph.xml)
6) ImageView (almost all .xml files)
7) ImageButton (almost all .xml files)
8) TextView (almost all .xml files)
9) Button (almost all .xml files)
10) EditText (almost all .xml files)
11) Switch (almost all .xml files)

## Application Link & Future Scope:
Link:  https://github.com/Chinmayeegade/Repristine
The entire app is still in its development phase. Once all the stated additions are made, it will undergo alpha and beta testings for efficiency, and the application will then be made available to everyone on the Google Play Store.






