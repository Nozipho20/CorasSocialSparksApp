Social Sparks App

Comprehensive report detailing the purpose of the app, its design considerations and the utilisation of GitHub Actions:
1. Purpose of the app
   
The Social Sparks App is a mobile app I built specifically for my close friend Cora to help make everyday social connections a little easier. Life moves fast, and when you're caught up in a busy schedule, it's genuinely easy to forget to reach out to the people you care about - friends, family, coworkers.
That's exactly the gap Social Sparks tries to fill. The whole idea is to give users small, doable "sparks" of social engagement based on whatever time of day it is. Think of it as a social prompt generator. Cora (or any user) just enters the time of day - Morning, Mid-morning, Afternoon, Dinner, After Dinner - and the app spits out one simple, manageable social action. Maybe it's sending a quick "good morning" text, dropping a "thinking of you," or just sharing a meme. Nothing overwhelming. Just enough to keep those connections alive.
3. Design Considerations

I went into the design with a "User-First" mindset, because an app like this only works if it actually feels good to use.
For the UI, I kept things clean and modern. I used square buttons, and a soft color palette so the whole thing feels welcoming rather than like another item on a to-do list. I also added a Clear/Reset button so Cora can wipe her input instantly without having to manually backspace, small thing, but it matters.
For user feedback, I added custom Android Toast messages that confirm every action (something like "Morning Spark Found!"). It's that little moment of "yes, it worked" that makes the experience feel responsive and alive, almost like haptic feedback, but through the screen.
On the error handling side, I know mobile users make typos constantly. Rather than having the app just sit there doing nothing, I built a custom "Oops!" message that gently points users toward the correct inputs. Nobody should feel stuck or confused - the app should always guide you back.
The logical flow uses if-else if branching to keep things lightweight and quick. Combined with the clear button, the whole experience feels smooth and low-friction.
For testing, I leaned heavily on Logcat debugging in Android Studio. I logged every input and output using Log.d and Log.e so I could verify the app's logic was working correctly before I even touched the UI. Watching it work in real time through Logcat gave me a lot of confidence before final submission.
4. GitHub & Version Control

I used GitHub as the central repo for this project, and I tried to treat it like a real professional workflow rather than just a place to dump files.
I made frequent, descriptive commits throughout development, things like "Added Reset Button logic," "Added square buttons," and "Fixed keyboard spacing bug" ,so there's a clear, readable history of how the project evolved. The logging work was committed separately too. All project files, including the APK and source code, are organized so anyone can navigate the repo without confusion.
5. GitHub Actions Integration

To push things further, I set up GitHub Actions for Continuous Integration. Every time I pushed code to the repository, a virtual environment automatically spun up, ran a build script, and checked for any errors in my Kotlin logic. It's the kind of workflow you'd see in a real software team.
A few things this gave me:
Consistency - every push gets built in a clean environment, so Gradle errors or code conflicts get caught immediately. The version in the repo is always functional.
Version Tracking - my commit history clearly shows when I finalized the submit logic versus when I polished the UI. There's a real timeline there.
Transparency - hosting everything on GitHub means my whole development process is open and verifiable, which I think is important for academic integrity.
Continuous Integration - if a typo in the Gradle files or Kotlin code broke anything, Actions would flag it right away. Only working code ever got finalized. It gave me real peace of mind throughout the whole build.















PICTURES OF MY APP SCREENSHOTS

1.                                                                                                             2             
                                                     















3 TYPING SOMETHING INCORRECT                                               
                                                                                                                                                                                                                         
      4 RESET BUTTON             
 

  
LINK TO THE GITHUB REPISOTORY
https://github.com/Nozipho20/CorasSocialSparksApp




LINK TO THE YOUTUBE VIDEO OF ME DEMOSTRATING HOW THE APP WORKS :
https://youtu.be/3aGWqzW6gUM?si=wV_tyqdh9W_zNA8R

                                                                                         
                                                                                                        















REFERENCE LIST:

1. Emeris.,2026. Introduction to Mobile Application Development IMAD5112/p/w Module   Manual. [e-book] Available through the Independent Institution of Education website . Available at:<https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BCA5A47EE-F107-44AD-AB60-6E296E0B3EAE%7D&file=IMAD5112MM.docx&action=default&mobileredirect=true> [Accessed 21 March 2026].

2. Smartherd., 2016 . #12 Android LogCat Tutorial : Android Studio Part – 2. [video online] Available at:<https://youtu.be/QqjrR11tuz0?si=ODGvGgObkT_5oyxu> [Accessed 21 March 2026].

3. Kotlin Docs.,2024. Control flow: if, when for, while. [Online]. Available at: <https://kotlinlang.org/docs/control-flow.html> [Accessed 21 March 2026].
4. Android Developers., 2024. Toasts overview. [online] Available at:<https://developer.android.com/guide/topics/ui/notifiers/toasts> [Accessed 21 March 2026].
5. Google Gemini.2023.Google Gemini(Version 1.0) .[Large language model]. Available at: https://gemini.google.com/ [Accessed: 21 March 2026].
6. Android Developers.,2024. Buttons. [online]. Available at:< https://developer.android.com/develop/ui/views/components/button >  [Accessed 21 March 2026].








ANNEXURE 

Title : Disclosure of AI Usage in my Assessment .

Sections:
Within the assessment the generative AI was used in Question 2 and 3 

Purpose intention behind the use:
I used AI for brainstorming 

Name of AI tool used.
Google Gemini

Date in which the AI was used 
21 March

Screenshots of the chats                                  
                            
                                                                                     
         
 



