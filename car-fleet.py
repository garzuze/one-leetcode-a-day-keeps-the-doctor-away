from typing import List

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = [0] * len(position)
        stack = []

        for i in range(len(position)):
            cars[i] = (position[i], speed[i])
        
        cars.sort(reverse=True)

        for car in cars:
            car_position = car[0]
            car_speed = car[1]

            time = (target - car_position) / car_speed

            if stack and stack[-1] >= time:
                continue
            else:
                stack.append(time)

        return len(stack)

