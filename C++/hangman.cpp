#include <cstdlib>
#include <ctime>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<string> words = {"programming", "hangman", "computer", "algorithm",
                        "coding"};
const int MAX_TRIES = 6;

string getRandomWord()
{
  srand(static_cast<unsigned int>(time(0)));
  int randomIndex = rand() % words.size();
  return words[randomIndex];
}

bool isWordGuessed(const string &word, const string &guessed)
{
  for (char letter : word)
  {
    if (guessed.find(letter) == string::npos)
    {
      return false;
    }
  }
  return true;
}

void displayHangman(int attempts)
{
  cout << "\n\n";
  if (attempts >= 1)
  {
    cout << "  ____" << endl;
    cout << " |    |" << endl;
  }
  if (attempts >= 2)
  {
    cout << " |    O" << endl;
  }
  if (attempts >= 3)
  {
    cout << " |   /";
    if (attempts >= 4)
    {
      cout << "|";
    }
    cout << "\\" << endl;
  }
  if (attempts >= 5)
  {
    cout << " |    |" << endl;
  }
  if (attempts >= 6)
  {
    cout << " |   / \\";
    if (attempts >= 7)
    {
      cout << " \\";
    }
    cout << endl;
  }
  cout << " |" << endl;
  cout << "_|___" << endl;
}

int main()
{
  string word = getRandomWord();
  string guessed(word.length(), '_');
  int tries = 0;

  cout << "Welcome to Hangman!" << endl;

  while (tries < MAX_TRIES && !isWordGuessed(word, guessed))
  {
    cout << "\nWord: " << guessed << endl;
    cout << "Attempts left: " << MAX_TRIES - tries << endl;
    char guess;
    cout << "Guess a letter: ";
    cin >> guess;

    if (word.find(guess) != string::npos)
    {
      for (size_t i = 0; i < word.length(); ++i)
      {
        if (word[i] == guess)
        {
          guessed[i] = guess;
        }
      }
    }
    else
    {
      ++tries;
      displayHangman(tries);
    }
  }

  if (isWordGuessed(word, guessed))
  {
    cout << "\nCongratulations! You guessed the word: " << word << endl;
  }
  else
  {
    cout << "\nSorry, you ran out of attempts. The word was: " << word << endl;
  }

  return 0;
}
