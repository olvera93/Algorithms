func numRescueBoats(_ people: [Int], _ limit: Int) -> Int {
    var sortPeople = people.sorted()
    
    var smallest = 0
    var biggest = sortPeople.count - 1
    
    var boats = 0
    while biggest >= smallest {
        if sortPeople[biggest] + sortPeople[smallest] <= limit {
            biggest -= 1
            smallest += 1
        } else {
            biggest -= 1
        }
        boats += 1
    }
    
    return boats
}

var people = [3,5,3,4]
let limit = 5
var result = numRescueBoats(people, limit)
print(result)
