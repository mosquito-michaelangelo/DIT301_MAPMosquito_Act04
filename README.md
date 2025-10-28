## How did you implement event handling for user actions?

I implemented event handling using the setOnClickListener() method on the Submit button, which triggers 
a handleSubmit() function when the user taps it. Inside this function, I retrieve text from both input 
fields using getText().toString().trim() to remove extra whitespace, then validate whether the fields 
are empty before attempting to convert the age to a number. If the inputs are valid, the app displays the 
information in a TextView; otherwise, it shows a Toast message indicating what went wrong. Initially, I
wasn't sure how to connect button clicks to actions, but I learned that setOnClickListener() essentially 
tells the app to execute specific code when the button is pressed, which became straightforward once I
understood the concept.

## What techniques ensured smooth and stable interaction?

To ensure the app runs smoothly without crashing, I employed several validation techniques. First, I validate 
inputs immediately by checking if fields are empty before processing, which prevents errors downstream. Second,
I wrapped the age conversion in a try-catch block to handle cases where users enter letters instead of numbers,
allowing the app to catch the error and display a friendly message rather than crashing. Third, I added an age 
range validation (1-150) to reject unrealistic values like 0 or 999. Finally, I used Toast messages to provide 
immediate, clear feedback about what needs to be corrected, such as "Please fill in all fields" or "Please enter
a valid number for age," which significantly improves the user experience by eliminating guesswork.

## What improvements would you add in future versions?

If I had more time to develop this app, I would add several enhancements. For better input validation, I'd 
include an email field with proper format checking, implement real-time validation that checks inputs as users 
type, and add a password field with a strength meter. I'd expand input options by adding radio buttons for gender 
selection, a Spinner dropdown for city or province selection, checkboxes for terms and conditions, and a DatePicker
instead of manual age entry for better accuracy and usability. For improved design, I'd incorporate animations 
for success and error messages, support dark mode, display error messages directly under input fields rather than just
using Toasts, and add icons next to fields for clarity. Additionally, I'd implement accessibility features including
TalkBack support for visually impaired users, support for larger text sizes, and ensure all colors have proper contrast.
Overall, this activity provided valuable learning about handling user input and error management in Android applications.
