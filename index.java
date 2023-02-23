String password = "..."; // replace with the generated password
int score = 0;
if (password.length() >= 8) {
    score++;
}
for (int i = 0; i < password.length(); i++) {
    char c = password.charAt(i);
    if (Character.isLetterOrDigit(c)) {
        score++;
    }
}
if (password.matches(".*[!@#$%^&*()].*")) {
    score++;
}
System.out.println("Password Quality: " + score + "/3");
