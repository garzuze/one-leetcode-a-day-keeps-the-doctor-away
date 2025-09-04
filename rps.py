def rps(p1, p2):
    if p1 == p2:
        return "Draw!"
    p1_wins = [("rock", "scissors"), ("paper", "rock"), ("scissors", "paper")]
    if (p1, p2) in p1_wins:
        return "Player 1 won!"
    return "Player 2 won!"


result = rps("rock", "scissors")
print(result)
