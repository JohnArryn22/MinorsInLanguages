def print_board(board):
    for i in range(3):
        for j in range(3):
            cell_value = board[i][j]
            if cell_value == "X" or cell_value == "O":
                print(f"{cell_value}", end="")
            else:
                cell_number = i * 3 + j + 1
                print(f"{cell_number}", end="")
            if j < 2:
                print(" | ", end="")
        print()
        if i < 2:
            print("-" * 9)

def check_winner(board, player):
    for row in board:
        if all([cell == player for cell in row]):
            return True
    for col in range(3):
        if all([row[col] == player for row in board]):
            return True
    if all([board[i][i] == player for i in range(3)]) or all([board[i][2 - i] == player for i in range(3)]):
        return True
    return False

def is_board_full(board):
    return all([cell != " " for row in board for cell in row])

def play_game():
    board = [[" " for _ in range(3)] for _ in range(3)]
    current_player = "X"

    while True:
        print_board(board)
        move = input(f"\nPlayer {current_player}, enter your move (1-9): ")
        
        if move.isdigit() and 1 <= int(move) <= 9:
            move = int(move) - 1
            row, col = divmod(move, 3)

            if board[row][col] == " ":
                board[row][col] = current_player
                if check_winner(board, current_player):
                    print_board(board)
                    print(f"\nPlayer {current_player} wins!")
                    break
                elif is_board_full(board):
                    print_board(board)
                    print("It's a tie!")
                    break
                else:
                    current_player = "O" if current_player == "X" else "X"
            else:
                print("\nThat cell is already occupied. Try again.")
        else:
            print("\nInvalid input. Please enter a number from 1 to 9.")

if __name__ == "__main__":
    play_game()
