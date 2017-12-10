sumOfOddElements1 :: [Int] -> Int
sumOfOddElements1 (x:xs) =
  [] -> 0
  x:ys -> (if x `mod` 2 == 1 then x else 0) + sumOfOddElements ys


sumOfOddElements2 :: [Int] -> Int
sumOfOddElements2 = sum . filter odd


-- This part handles the Input/Output and can be used as it is. Do not change or modify it.
main = do
   inputdata <- getContents
   putStrLn $ show $ sumOfOddElements2 $ map (read :: String -> Int) $ lines inputdat