

import itertools

digits_test = [5,2,0,6,6,5,9,1,3,1,2,4,7,5,5,3,5,3,5,3,6,7,0,3,7,5,5,8,3,2,0,0,4,4,4,5,4,8,8,4,3,0,7,8,1,0,8,3,1,6,8,3,6,9,5,2,1,2,5,0,2,2,2,1,3,0,7,5,8,2,2,2,5,6,5,9,8,3,1,2,1,0,5,8,5,8,7,1,0,1,9,5,7,1,0,3,4,1,2,7]
digits = list(set(digits_test))

r = 3

permutations  = list(itertools.permutations(digits,r))

results = []

for perm in permutations:
  
  temp_perm = int("".join(map(str, perm)))

  if(temp_perm % 2 == 0) and len(str(temp_perm)) == 3:
    # print(temp_perm in results)
    if temp_perm in results:
      pass
    else:
      results.append(temp_perm)

results.sort()

print(results)

        # #digits = [ 2, 1, 3, 0]
        # if  len(digits) > 25:
        #     digits = list(set(digits))
        # r = 3

        # permutations  = list(itertools.permutations(digits,r))

        # results = []

        # for perm in permutations:
        
        #     temp_perm = int("".join(map(str, perm)))

        #     if(temp_perm % 2 == 0) and len(str(temp_perm)) == 3:
        #         # print(temp_perm in results)
        #         if temp_perm in results:
        #             pass
        #         else:
        #             results.append(temp_perm)

        # results.sort()

        # return results

